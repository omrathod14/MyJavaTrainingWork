package com.aurionpro.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AdminConfigServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		ServletConfig config = getServletConfig();

		String storeName = config.getInitParameter("storeName");
		String adminEmail = config.getInitParameter("adminEmail");
		String category = config.getInitParameter("category");

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h1>Admin Panel</h1>");
		out.println("<p>Configured Category: " + category + "</p>");
		out.println("<p>Store Name: " + storeName + "</p>");
		out.println("<p>Contact Admin: " + adminEmail + "</p>");
	}
}
