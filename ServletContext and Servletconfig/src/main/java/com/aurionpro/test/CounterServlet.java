package com.aurionpro.test;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/visit")
public class CounterServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext con = getServletContext();
		Integer count = (Integer) con.getAttribute("counter");

		count++;
		con.setAttribute("counter", count);

		resp.setContentType("text/html");

		resp.getWriter().write("Visitor count: " + count);

	}

}
