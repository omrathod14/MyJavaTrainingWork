package com.aurionpro.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);
		session.setMaxInactiveInterval(30);
		String username = (String) session.getAttribute("username");

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		out.println("<!DOCTYPE html>");
		out.println("<html><head><title>Products</title>");
		out.println(
				"<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css' rel='stylesheet'>");
		out.println("</head><body class='bg-light'>");

		out.println("<div class='container mt-4'>");
		out.println("<h2 class='text-success text-center mb-4'>Welcome, " + username + "!</h2>");
		out.println("<div class='card p-4 shadow'>");
		out.println("<h4 class='mb-3'>Select Products:</h4>");
		out.println("<form action='CartServlet' method='post'>");

		String[] products = { "Laptop", "Phone", "Headphones", "Smartwatch", "Camera" };
		for (String product : products) {
			out.println("<div class='form-check mb-2'>");
			out.println("<input class='form-check-input' type='checkbox' name='product' value='" + product + "'>");
			out.println("<label class='form-check-label fw-semibold'>" + product + "</label>");
			out.println("</div>");
		}

		out.println("<button type='submit' class='btn btn-primary mt-3'>Add to Cart</button>");
		out.println("</form></div></div></body></html>");
	}
}
