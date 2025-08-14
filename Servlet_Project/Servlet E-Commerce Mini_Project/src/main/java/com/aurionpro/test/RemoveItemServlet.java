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

@WebServlet("/RemoveItemServlet")
public class RemoveItemServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String itemToRemove = request.getParameter("item");

		HttpSession session = request.getSession(false);
		session.setMaxInactiveInterval(30);
		if (session != null && itemToRemove != null) {
			List<String> cart = (List<String>) session.getAttribute("cart");
			if (cart != null) {
				cart.remove(itemToRemove);
			}
		}

		response.sendRedirect("ViewCartServlet");
	}
}
