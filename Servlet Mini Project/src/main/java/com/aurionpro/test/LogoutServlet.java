package com.aurionpro.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Invalidate session
		HttpSession session = request.getSession(false);
		if (session != null) {
			session.invalidate();
		}

		// Optionally remove cookies
		Cookie lastVisit = new Cookie("lastVisit", "");
		lastVisit.setMaxAge(0);
		response.addCookie(lastVisit);

		// Redirect to login page
		response.sendRedirect("index.html");
	}
}
