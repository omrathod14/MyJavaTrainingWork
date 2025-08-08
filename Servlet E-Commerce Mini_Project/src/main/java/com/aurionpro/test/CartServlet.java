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

@WebServlet("/CartServlet")
public class CartServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		session.setMaxInactiveInterval(10);
		String[] selectedProducts = request.getParameterValues("product");

		List<String> cart = (List<String>) session.getAttribute("cart");
		if (cart == null) {
			cart = new ArrayList<>();
		}

		if (selectedProducts != null) {
			Collections.addAll(cart, selectedProducts);
		}

		session.setAttribute("cart", cart);

		RequestDispatcher rd = request.getRequestDispatcher("ViewCartServlet");
		rd.forward(request, response);
	}
}
