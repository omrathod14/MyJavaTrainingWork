package com.aurionpro.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aurionpro.util.DBConnection;

@WebServlet("/submitAnswer")
public class SubmitAnswerServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
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

		int qid = Integer.parseInt(request.getParameter("qid"));
		String selectedOption = request.getParameter("answer");

		try (Connection conn = DBConnection.getConnection()) {
			PreparedStatement stmt = conn.prepareStatement("SELECT correct_option FROM questions WHERE id=?");
			stmt.setInt(1, qid);
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				String correctOption = rs.getString("correct_option");
				Integer score = (Integer) session.getAttribute("score");
				if (score == null)
					score = 0;
				if (correctOption.equalsIgnoreCase(selectedOption))
					score++;
				session.setAttribute("score", score);
			}

			// Track used questions
			@SuppressWarnings("unchecked")
			Set<Integer> usedQuestions = (Set<Integer>) session.getAttribute("usedQuestions");
			usedQuestions.add(qid);
			session.setAttribute("usedQuestions", usedQuestions);

			// Track user answers
			@SuppressWarnings("unchecked")
			Map<Integer, String> userAnswers = (Map<Integer, String>) session.getAttribute("userAnswers");
			userAnswers.put(qid, selectedOption);
			session.setAttribute("userAnswers", userAnswers);

			// Increment count
			Integer questionCount = (Integer) session.getAttribute("questionCount");
			session.setAttribute("questionCount", questionCount + 1);

			response.sendRedirect(request.getContextPath() + "/question");

		} catch (SQLException e) {
			e.printStackTrace();
			response.getWriter().println("Error: " + e.getMessage());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
