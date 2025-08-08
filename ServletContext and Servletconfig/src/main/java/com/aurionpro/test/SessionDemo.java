package com.aurionpro.test;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Session")
public class SessionDemo extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession(true);

		// Get or initialize visit count
		Integer visitCount = (Integer) session.getAttribute("visitCount");
		if (visitCount == null)
			visitCount = 1;
		else
			visitCount++;

		session.setAttribute("visitCount", visitCount);
		session.setAttribute("userID", "Admin");

		// Logic to end session after 5 visits
		if (visitCount >= 5) {
			session.invalidate();
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<html><body style='background-color:#f0f0f0;'>"
					+ "<h2 style='color:red;text-align:center;'>Session ended after 5 visits.</h2>" + "</body></html>");
			return;
		}

		// If visitCount < 5, set session timeout to 5 minutes (300 seconds)
		session.setMaxInactiveInterval(300); // 5 minutes

		// Collect session info
		Date createTime = new Date(session.getCreationTime());
		Date lastAccessTime = new Date(session.getLastAccessedTime());
		String userID = (String) session.getAttribute("userID");

		// HTML Response
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String docType = "<!doctype html public \"-//w3c//dtd html 4.0 transitional//en\">\n";
		out.println(docType + "<html>\n" + "<head><title>Servlet Session Demo</title></head>\n"
				+ "<body bgcolor=\"#f0f0f0\">\n" + "<h1 align=\"center\">Servlet Session Demo</h1>\n"
				+ "<h2 align=\"center\">Session Information</h2>\n" + "<table border=\"1\" align=\"center\">\n"
				+ "<tr bgcolor=\"#949494\">\n" + "  <th>Session Info</th><th>Value</th></tr>\n"
				+ "<tr><td>Session ID</td><td>" + session.getId() + "</td></tr>\n" + "<tr><td>Creation Time</td><td>"
				+ createTime + "</td></tr>\n" + "<tr><td>Last Accessed Time</td><td>" + lastAccessTime + "</td></tr>\n"
				+ "<tr><td>User ID</td><td>" + userID + "</td></tr>\n" + "<tr><td>Visit Count</td><td>" + visitCount
				+ "</td></tr>\n" + "<tr><td>Session Timeout</td><td>" + session.getMaxInactiveInterval()
				+ " seconds</td></tr>\n" + "</table></body></html>");
	}
}
