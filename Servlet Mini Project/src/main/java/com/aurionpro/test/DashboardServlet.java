package com.aurionpro.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/dashboard", initParams = {
		@WebInitParam(name = "instructor", value = "Prof. Amit Tiwari") })
public class DashboardServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	private void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);
		if (session == null || session.getAttribute("studentName") == null) {
			response.sendRedirect("index.html");
			return;
		}

		String name = (String) session.getAttribute("studentName");
		String loginTime = session.getAttribute("loginTime").toString();

		// Decode last visit from cookie
		String lastVisit = "This is your first visit.";
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if ("lastVisit".equals(cookie.getName())) {
					lastVisit = URLDecoder.decode(cookie.getValue(), "UTF-8");
					break;
				}
			}
		}

		// Read values
		ServletContext context = getServletContext();
		String motto = context.getInitParameter("portalMotto"); // From ServletContextListener or StartupServlet
		String instructor = getInitParameter("instructor"); // From annotation

		Integer onlineCount = (Integer) context.getAttribute("onlineCount");
		if (onlineCount == null)
			onlineCount = 0;

		// Response
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<!DOCTYPE html><html><head>");
		out.println("<title>Dashboard</title>");
		out.println(
				"<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css' rel='stylesheet'>");
		out.println("</head><body class='bg-light'>");

		out.println("<div class='container mt-5'>");
		out.println("<div class='card shadow p-4'>");
		out.println("<h3 class='text-success'>Welcome, " + name + "!</h3>");
		out.println("<p><strong>You logged in at:</strong> " + loginTime + "</p>");
		out.println("<p><strong>Your last visit was:</strong> " + lastVisit + "</p>");
		out.println("<p><strong>Current online users:</strong> " + onlineCount + "</p>");
		out.println("<p><strong>Instructor:</strong> " + instructor + "</p>");
		out.println("<p><strong>Portal Motto:</strong> <em>" + motto + "</em></p>");
		out.println("<a class='btn btn-danger mt-3' href='logout'>Logout</a>");
		out.println("</div></div>");

		out.println("</body></html>");
	}
}
