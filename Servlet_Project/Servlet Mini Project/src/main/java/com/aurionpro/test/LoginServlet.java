package com.aurionpro.test;

import java.io.IOException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("studentName");

		if (name == null || name.trim().isEmpty()) {
			RequestDispatcher rd = request.getRequestDispatcher("error.html");
			rd.forward(request, response);
			return;
		}

		// Store in session
		HttpSession session = request.getSession();
		session.setAttribute("studentName", name);
		session.setAttribute("loginTime", new Date());

		// Store last visit time in cookie (formatted safely)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
		String visitTime = URLEncoder.encode(sdf.format(new Date()), "UTF-8");

		Cookie lastVisit = new Cookie("lastVisit", visitTime);
		lastVisit.setMaxAge(60 * 60 * 24); 
		response.addCookie(lastVisit);

		// Forward to dashboard
		
		//response.sendRedirect("dashboard"); // replace forward with redirect

		RequestDispatcher rd = request.getRequestDispatcher("dashboard");
		rd.forward(request, response);

	}
}
