package com.aurionpro.test;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ViewCartServlet")
public class ViewCartServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		HttpSession session = request.getSession(false);
		session.setMaxInactiveInterval(30);
		List<String> cart = (List<String>) session.getAttribute("cart");

		out.println("<!DOCTYPE html>");
		out.println("<html><head><title>Cart Summary</title>");
		out.println(
				"<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css' rel='stylesheet'>");
		out.println("</head><body class='bg-light'>");

		out.println("<div class='container mt-4'>");
		out.println("<h2 class='text-info text-center mb-4'> Cart Summary</h2>");

		if (cart == null || cart.isEmpty()) {
			out.println("<div class='alert alert-warning text-center'>Your cart is empty.</div>");
		} else {
			out.println("<ul class='list-group mb-3'>");
			for (String item : cart) {
				out.println("<li class='list-group-item d-flex justify-content-between align-items-center'>" + item
						+ "<form action='RemoveItemServlet' method='post' class='d-inline'>"
						+ "<input type='hidden' name='item' value='" + item + "'>"
						+ "<button type='submit' class='btn btn-sm btn-outline-danger'> Remove</button>"
						+ "</form></li>");
			}
			out.println("</ul>");

			out.println("<form action='ClearCartServlet' method='post' class='mb-2'>");
			out.println("<button type='submit' class='btn btn-warning w-100'> Remove All</button>");
			out.println("</form>");
		}

		out.println("<form action='LogoutServlet' method='post'>");
		out.println("<button type='submit' class='btn btn-danger w-100'>Logout</button>");
		out.println("</form>");
		out.println("</div></body></html>");
	}
}
