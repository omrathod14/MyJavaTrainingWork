package com.aurionpro.test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie c : cookies) {
				if ("username".equals(c.getName())) {
					c.setMaxAge(0); // delete the cookie
					response.addCookie(c);
					break;
				}
			}
		}

		response.setContentType("text/html");
		response.getWriter().println("<h3>You have been logged out.</h3>");
		response.getWriter().println("<a href='login.html'>Login Again</a>");
	}
}
