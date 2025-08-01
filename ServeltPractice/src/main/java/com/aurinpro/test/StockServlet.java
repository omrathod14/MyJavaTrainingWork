package com.aurinpro.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/stock")
public class StockServlet extends HttpServlet {

	// Simulated product inventory: productId -> Product
	private static final Map<String, Product> inventory = new HashMap<>();

	static {
		inventory.put("1001", new Product("Laptop", 5));
		inventory.put("1002", new Product("Headphones", 0));
		inventory.put("1023", new Product("Smartphone", 12));
		inventory.put("1050", new Product("Keyboard", 3));
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String productId = request.getParameter("productId");

		if (productId == null || productId.trim().isEmpty()) {
			out.println("<h3 style='color:red;'>Product ID is required!</h3>");
			return;
		}

		productId = productId.trim();

		if (inventory.containsKey(productId)) {
			Product product = inventory.get(productId);

			out.println("<h2>Product Stock Information</h2>");
			out.println("<ul>");
			out.println("<li><strong>Product Name:</strong> " + product.name + "</li>");
			out.println("<li><strong>Availability:</strong> " + (product.stock > 0 ? "In Stock" : "Out of Stock")
					+ "</li>");
			out.println("<li><strong>Stock Count:</strong> " + product.stock + "</li>");
			out.println("</ul>");
		} else {
			out.println("<h3 style='color:red;'>No product found with ID: " + productId + "</h3>");
		}
	}

	// Inner class to represent a Product
	static class Product {
		String name;
		int stock;

		public Product(String name, int stock) {
			this.name = name;
			this.stock = stock;
		}
	}
}
