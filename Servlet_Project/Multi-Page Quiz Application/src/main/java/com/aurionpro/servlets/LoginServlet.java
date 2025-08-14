package com.aurionpro.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.HashSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aurionpro.util.DBConnection;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final int TEST_DURATION_SECONDS = 120; // 2 minutes

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String password = request.getParameter("password");

		try (Connection conn = DBConnection.getConnection()) {
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM users WHERE email=? AND password=?");
			stmt.setString(1, email);
			stmt.setString(2, password);
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				HttpSession oldSession = request.getSession(false);
				if (oldSession != null)
					oldSession.invalidate();

				HttpSession session = request.getSession(true);
				session.setAttribute("username", rs.getString("username"));
				session.setAttribute("userId", rs.getInt("id"));
				session.setAttribute("score", 0);
				session.setAttribute("usedQuestions", new HashSet<Integer>());
				session.setAttribute("questionCount", 0);
				session.setAttribute("userAnswers", new HashMap<Integer, String>());

				long endTime = System.currentTimeMillis() + (TEST_DURATION_SECONDS * 1000L);
				session.setAttribute("endTime", endTime);

				response.sendRedirect(request.getContextPath() + "/question");
			} else {
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				out.println("<div style='text-align:center;color:red;font-size:20px;'>Invalid Credentials</div>");
				out.println("<a href='" + request.getContextPath() + "/login.html'>Back to Login</a>");
			}

		} catch (SQLException e) {
			e.printStackTrace();
			response.getWriter().println("Database error: " + e.getMessage());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
