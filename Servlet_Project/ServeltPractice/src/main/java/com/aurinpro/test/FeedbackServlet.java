package com.aurinpro.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/feedback")
public class FeedbackServlet extends HttpServlet {

	private static final List<String> feedbackList = new ArrayList<>();

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String productId = request.getParameter("productId");
		String ratingStr = request.getParameter("rating");
		String review = request.getParameter("review");

		boolean hasError = false;
		StringBuilder errors = new StringBuilder();

		// Validate rating
		int rating = 0;
		try {
			rating = Integer.parseInt(ratingStr);
			if (rating < 1 || rating > 5) {
				hasError = true;
				errors.append("<li>Rating must be between 1 and 5.</li>");
			}
		} catch (NumberFormatException e) {
			hasError = true;
			errors.append("<li>Invalid rating value.</li>");
		}

		// Validate review
		if (review == null || review.trim().isEmpty()) {
			hasError = true;
			errors.append("<li>Review cannot be empty.</li>");
		}

		if (hasError) {
			out.println("<h2 style='color:red;'>Validation Errors:</h2>");
			out.println("<ul>" + errors + "</ul>");
		} else {
			// Optionally store feedback
			String feedback = "Product ID: " + productId + ", Rating: " + rating + ", Review: " + review;
			feedbackList.add(feedback);

			// Thank you message
			out.println("<h2>Thank you for your feedback!</h2>");
			out.println("<p><strong>Product ID:</strong> " + productId + "</p>");
			out.println("<p><strong>Rating:</strong> " + rating + "</p>");
		}
	}
}
