package com.aurionpro.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);
		if (session != null) {
			session.invalidate();
		}

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<!DOCTYPE html>");
		out.println("<html><head><title>Logout</title>");
		out.println(
				"<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css' rel='stylesheet'>");
		out.println("</head><body class='bg-light'>");

		out.println("<div class='container mt-5'>");
		out.println("<div class='alert alert-success text-center'>");
		out.println("<h4>You have been logged out successfully.</h4>");
		out.println("</div>");
		out.println("<div class='text-center'>");
		out.println("<a href='index.html' class='btn btn-primary'>Login Again</a>");
		out.println("</div></div></body></html>");
	}
}
