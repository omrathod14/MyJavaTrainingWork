package com.aurionpro.test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = null;
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie c : cookies) {
				if ("username".equals(c.getName())) {
					username = c.getValue();
					break;
				}
			}
		}

		response.setContentType("text/html");

		if (username != null) {
			response.getWriter().println("<h2>Welcome, " + username + "!</h2>");
			response.getWriter().println("<a href='logout'>Logout</a>");
		} else {
			response.getWriter().println("<h3>You are not logged in. Please <a href='login.html'>Login</a></h3>");
		}
	}
}
