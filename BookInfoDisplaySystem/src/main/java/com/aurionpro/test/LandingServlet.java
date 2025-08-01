package com.aurionpro.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LandingServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		ServletContext context = getServletContext();

		Integer totalVisitors = (Integer) context.getAttribute("totalVisitors");
		if (totalVisitors == null)
			totalVisitors = 0;
		totalVisitors++;
		context.setAttribute("totalVisitors", totalVisitors);

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h1>Welcome to ReadRealm!</h1>");
		out.println("<p>Total Visitors So Far: " + totalVisitors + "</p>");
		out.println("<p>Select a Category:</p>");
		out.println("<ul>");
		out.println("<li><a href='category?type=Fiction'>Fiction</a></li>");
		out.println("<li><a href='category?type=Science'>Science</a></li>");
		out.println("<li><a href='category?type=Technology'>Technology</a></li>");
		out.println("</ul>");
	}
}
