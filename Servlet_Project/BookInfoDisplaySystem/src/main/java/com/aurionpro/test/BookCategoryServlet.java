package com.aurionpro.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BookCategoryServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		ServletContext context = getServletContext();
		String category = req.getParameter("type");

		// Get totalVisitors
		Integer totalVisitors = (Integer) context.getAttribute("totalVisitors");
		if (totalVisitors == null)
			totalVisitors = 0;

		// Get and update category-wise count
		String attrName = category.toLowerCase() + "Count";
		Integer categoryCount = (Integer) context.getAttribute(attrName);
		if (categoryCount == null)
			categoryCount = 0;
		categoryCount++;
		context.setAttribute(attrName, categoryCount);

		// Get app version
		String version = context.getInitParameter("appVersion");

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h2>Book Category: " + category + "</h2>");
		out.println("<p>Store: ReadRealm</p>");
		out.println("<p>Admin Email: admin@readrealm.com</p>");
		out.println("<p>" + category + " Books Visited: " + categoryCount + "</p>");
		out.println("<p>Total Visitors: " + totalVisitors + "</p>");
		out.println("<p>App Version: " + version + "</p>");
	}
}
