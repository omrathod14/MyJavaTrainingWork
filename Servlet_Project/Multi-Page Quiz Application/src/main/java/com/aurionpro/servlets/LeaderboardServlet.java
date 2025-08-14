package com.aurionpro.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession; 

import com.aurionpro.util.DBConnection;

@WebServlet("/leaderboard")
public class LeaderboardServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);
		Integer currentUserId = (session != null) ? (Integer) session.getAttribute("userId") : null;

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<!DOCTYPE html><html lang='en'><head>");
		out.println("<meta charset='UTF-8'><title>Leaderboard</title>");
		out.println(
				"<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css' rel='stylesheet'>");
		out.println("<style>.highlight { background-color: #d4edda !important; }</style>");
		out.println("</head><body class='bg-light'>");

		out.println("<div class='container mt-5'>");
		out.println("<h2 class='mb-4'>Leaderboard</h2>");
		out.println("<table class='table table-bordered table-striped'>");
		out.println("<thead><tr><th>Rank</th><th>Username</th><th>Score</th><th>Date</th></tr></thead>");
		out.println("<tbody>");

		try (Connection conn = DBConnection.getConnection()) {
			PreparedStatement stmt = conn.prepareStatement("SELECT u.id, u.username, t.score, t.date "
					+ "FROM users u JOIN test_log t ON u.id = t.user_id " + "ORDER BY t.score DESC, t.date ASC");
			ResultSet rs = stmt.executeQuery();

			int rank = 1;
			while (rs.next()) {
				int userId = rs.getInt("id");
				String rowClass = (currentUserId != null && currentUserId.equals(userId)) ? "highlight" : "";

				out.println("<tr class='" + rowClass + "'>");
				out.println("<td>" + rank++ + "</td>");
				out.println("<td>" + rs.getString("username") + "</td>");
				out.println("<td>" + rs.getInt("score") + "</td>");
				out.println("<td>" + rs.getTimestamp("date") + "</td>");
				out.println("</tr>");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		out.println("</tbody></table>");
		out.println("<div class='mt-3'>");
		out.println("<a href='" + request.getContextPath() + "/login.html' class='btn btn-primary'>Back to Login</a>");
		out.println("</div>");
		out.println("</div></body></html>");
	}
}
