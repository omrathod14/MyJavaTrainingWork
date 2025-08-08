package com.aurionpro.test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if ("admin".equals(username) && "1234".equals(password)) {
			
			// Create a cookie
			Cookie userCookie = new Cookie("username", username);
			userCookie.setMaxAge(60);
			response.addCookie(userCookie);

			response.sendRedirect("welcome");
		} else {
			response.setContentType("text/html");
			response.getWriter().println("<h3 style='color:red;'>Invalid credentials!</h3>");
			request.getRequestDispatcher("login.html").include(request, response);
		}
	}
}
