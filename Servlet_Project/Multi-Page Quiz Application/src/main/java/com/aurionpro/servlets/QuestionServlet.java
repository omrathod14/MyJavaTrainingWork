package com.aurionpro.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aurionpro.util.DBConnection;

@WebServlet("/question")
public class QuestionServlet extends HttpServlet {
	private static final int TOTAL_QUESTIONS_PER_TEST = 3;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);
		if (session == null || session.getAttribute("userId") == null) {
			response.sendRedirect(request.getContextPath() + "/login.html");
			return;
		}

		Long endTime = (Long) session.getAttribute("endTime");
		if (endTime != null && System.currentTimeMillis() > endTime) {
			response.sendRedirect(request.getContextPath() + "/result");
			return;
		}

		Integer questionCount = (Integer) session.getAttribute("questionCount");
		if (questionCount != null && questionCount >= TOTAL_QUESTIONS_PER_TEST) {
			response.sendRedirect(request.getContextPath() + "/result");
			return;
		}

		@SuppressWarnings("unchecked")
		Set<Integer> usedQuestions = (Set<Integer>) session.getAttribute("usedQuestions");
		if (usedQuestions == null) {
			usedQuestions = new HashSet<>();
			session.setAttribute("usedQuestions", usedQuestions);
		}

		@SuppressWarnings("unchecked")
		List<Integer> questionHistory = (List<Integer>) session.getAttribute("questionHistory");
		if (questionHistory == null) {
			questionHistory = new ArrayList<>();
			session.setAttribute("questionHistory", questionHistory);
		}

		String action = request.getParameter("action");

		try (Connection conn = DBConnection.getConnection()) {
			ResultSet rs = null;

			if ("previous".equals(action) && questionHistory.size() > 1) {
				// Remove current question from history
				questionHistory.remove(questionHistory.size() - 1);
				int prevId = questionHistory.get(questionHistory.size() - 1);

				PreparedStatement stmt = conn.prepareStatement("SELECT * FROM questions WHERE id = ?");
				stmt.setInt(1, prevId);
				rs = stmt.executeQuery();
			} else if ("skip".equals(action)) {
				rs = getRandomQuestion(conn, usedQuestions);
			} else {
				rs = getRandomQuestion(conn, usedQuestions);
			}

			if (rs != null && rs.next()) {
				int qid = rs.getInt("id");
				if (!"previous".equals(action)) {
					usedQuestions.add(qid);
					questionHistory.add(qid);
				}
				renderQuestionPage(response, rs, session, questionHistory.size() > 1);
			} else {
				response.sendRedirect(request.getContextPath() + "/result");
			}

		} catch (SQLException e) {
			e.printStackTrace();
			response.setContentType("application/json");
			response.getWriter().println("{\"error\":\"Database error: " + e.getMessage() + "\"}");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	private ResultSet getRandomQuestion(Connection conn, Set<Integer> usedQuestions) throws SQLException {
		StringBuilder sql = new StringBuilder("SELECT * FROM questions");
		if (!usedQuestions.isEmpty()) {
			sql.append(" WHERE id NOT IN (");
			sql.append(usedQuestions.stream().map(q -> "?").collect(Collectors.joining(",")));
			sql.append(")");
		}
		sql.append(" ORDER BY RAND() LIMIT 1");

		PreparedStatement stmt = conn.prepareStatement(sql.toString());
		int index = 1;
		for (Integer id : usedQuestions) {
			stmt.setInt(index++, id);
		}
		return stmt.executeQuery();
	}

	private void renderQuestionPage(HttpServletResponse response, ResultSet rs, HttpSession session,
			boolean hasPrevious) throws SQLException, IOException {

		int qid = rs.getInt("id");
		String question = rs.getString("question_text");
		String optionA = rs.getString("option_a");
		String optionB = rs.getString("option_b");
		String optionC = rs.getString("option_c");
		String optionD = rs.getString("option_d");
		long endTime = (Long) session.getAttribute("endTime");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<!DOCTYPE html><html lang='en'><head>");
		out.println("<meta charset='UTF-8'><title>Quiz Question</title>");
		out.println(
				"<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css' rel='stylesheet'>");

		// Timer JS
		out.println("<script>");
		out.println("var endTime = " + endTime + ";");
		out.println("function updateTimer(){");
		out.println("  var now = new Date().getTime();");
		out.println("  var distance = endTime - now;");
		out.println("  if(distance <= 0){ window.location.href='" + session.getServletContext().getContextPath()
				+ "/result'; return; }");
		out.println("  var minutes = Math.floor((distance % (1000*60*60))/(1000*60));");
		out.println("  var seconds = Math.floor((distance % (1000*60))/1000);");
		out.println("  document.getElementById('timer').innerHTML = minutes+'m '+seconds+'s';");
		out.println("}");
		out.println("setInterval(updateTimer,1000);");
		out.println("</script>");
		out.println("</head><body class='bg-light'>");

		out.println("<div class='container mt-5'>");
		out.println("<div class='d-flex justify-content-between mb-3'>");
		out.println("<h3>" + question + "</h3>");
		out.println("<div><strong>Time Left: <span id='timer'></span></strong></div>");
		out.println("</div>");

		out.println("<form method='post' action='" + session.getServletContext().getContextPath() + "/submitAnswer'>");
		out.println("<input type='hidden' name='qid' value='" + qid + "'>");
		out.println(buildOption("A", optionA));
		out.println(buildOption("B", optionB));
		out.println(buildOption("C", optionC));
		out.println(buildOption("D", optionD));
		out.println("<br><button type='submit' class='btn btn-primary me-2'>Submit</button>");
		out.println("<a href='" + session.getServletContext().getContextPath()
				+ "/question?action=skip' class='btn btn-warning me-2'>Skip Question</a>");
		if (hasPrevious) {
			out.println("<a href='" + session.getServletContext().getContextPath()
					+ "/question?action=previous' class='btn btn-secondary'>Previous Question</a>");
		}
		out.println("</form></div></body></html>");
	}

	private String buildOption(String value, String text) {
		return "<div class='form-check'>" + "<input class='form-check-input' type='radio' name='answer' value='" + value
				+ "' required>" + "<label class='form-check-label'>" + text + "</label>" + "</div>";
	}
}