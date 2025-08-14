package com.aurionpro.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aurionpro.util.DBConnection;

@WebServlet("/result")
public class ResultServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);
		if (session == null || session.getAttribute("userId") == null) {
			response.sendRedirect(request.getContextPath() + "/login.html");
			return;
		}

		Integer score = (Integer) session.getAttribute("score");
		@SuppressWarnings("unchecked")
		Map<Integer, String> userAnswers = (Map<Integer, String>) session.getAttribute("userAnswers");
		Integer userId = (Integer) session.getAttribute("userId");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<!DOCTYPE html><html lang='en'><head>");
		out.println("<meta charset='UTF-8'><title>Test Result</title>");
		out.println(
				"<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css' rel='stylesheet'>");
		out.println("</head><body class='bg-light'>");

		out.println("<div class='container mt-5'>");
		out.println("<h2 class='mb-4'>Test Result</h2>");

		// Show score
		out.println("<h4>Your Score: " + score + "</h4><hr>");

		// Show answers summary
		out.println("<h5>Answers Summary:</h5>");
		out.println("<table class='table table-striped table-bordered'>");
		out.println(
				"<thead><tr><th>Question</th><th>Your Answer</th><th>Correct Answer</th><th>Result</th></tr></thead>");
		out.println("<tbody>");

		if (userAnswers != null && !userAnswers.isEmpty()) {
			try (Connection conn = DBConnection.getConnection()) {
				for (Map.Entry<Integer, String> entry : userAnswers.entrySet()) {
					int qid = entry.getKey();
					String userAns = entry.getValue();

					PreparedStatement stmt = conn
							.prepareStatement("SELECT question_text, correct_option FROM questions WHERE id=?");
					stmt.setInt(1, qid);
					ResultSet rs = stmt.executeQuery();
					if (rs.next()) {
						String questionText = rs.getString("question_text");
						String correctOption = rs.getString("correct_option");
						String resultText = userAns.equalsIgnoreCase(correctOption) ? "Correct" : "Wrong";

						out.println("<tr>");
						out.println("<td>" + questionText + "</td>");
						out.println("<td>" + userAns + "</td>");
						out.println("<td>" + correctOption + "</td>");
						out.println("<td>" + resultText + "</td>");
						out.println("</tr>");
					}
				}

				// Insert user test log into test_log
				PreparedStatement logStmt = conn
						.prepareStatement("INSERT INTO test_log(user_id, score, date) VALUES (?, ?, NOW())");
				logStmt.setInt(1, userId);
				logStmt.setInt(2, score);
				logStmt.executeUpdate();

			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		out.println("</tbody></table><hr>");

//		// Show all users who attended the test
//		out.println("<h5>Users who took the test:</h5>");
//		out.println("<table class='table table-bordered table-striped'>");
//		out.println("<thead><tr><th>Username</th><th>Score</th><th>Date</th></tr></thead>");
//		out.println("<tbody>");
//		try (Connection conn = DBConnection.getConnection()) {
//			ResultSet rs = conn.createStatement().executeQuery("SELECT u.username, t.score, t.date "
//					+ "FROM users u JOIN test_log t ON u.id = t.user_id ORDER BY t.date DESC");
//			while (rs.next()) {
//				out.println("<tr>");
//				out.println("<td>" + rs.getString("username") + "</td>");
//				out.println("<td>" + rs.getInt("score") + "</td>");
//				out.println("<td>" + rs.getTimestamp("date") + "</td>");
//				out.println("</tr>");
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} catch (Exception e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}

		out.println("<div class='mt-3'>");
		out.println(
				"<a href='" + request.getContextPath() + "/login.html' class='btn btn-primary me-2'>Back to Login</a>");
		out.println(
				"<a href='" + request.getContextPath() + "/leaderboard' class='btn btn-success'>View Leaderboard</a>");
		out.println("</div>");

		// Clear session attributes after test
		session.invalidate();
	}
}
