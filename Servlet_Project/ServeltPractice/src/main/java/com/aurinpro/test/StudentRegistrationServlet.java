package com.aurinpro.test;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/register")
public class StudentRegistrationServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// Collect parameters
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String ageStr = request.getParameter("age");
		String course = request.getParameter("course");

		// Validation flags
		boolean hasError = false;
		StringBuilder errors = new StringBuilder();

		// Validate name
		if (name == null || name.trim().isEmpty()) {
			hasError = true;
			errors.append("<li>Name cannot be empty.</li>");
		}

		// Validate email
		if (email == null || email.trim().isEmpty()) {
			hasError = true;
			errors.append("<li>Email cannot be empty.</li>");
		}

		// Validate age
		int age = 0;
		try {
			age = Integer.parseInt(ageStr);
			if (age < 18) {
				hasError = true;
				errors.append("<li>Age must be 18 or older.</li>");
			}
		} catch (NumberFormatException e) {
			hasError = true;
			errors.append("<li>Age must be a valid number.</li>");
		}

		// Validate course
		if (course == null || course.trim().isEmpty()) {
			hasError = true;
			errors.append("<li>Course must be selected.</li>");
		}

		// Display result
		if (hasError) {
			out.println("<h2 style='color:red;'>Validation Errors:</h2>");
			out.println("<ul>" + errors + "</ul>");
		} else {
			out.println("<h2>Registration Successful!</h2>");
			out.println("<p><strong>Name:</strong> " + name + "</p>");
			out.println("<p><strong>Email:</strong> " + email + "</p>");
			out.println("<p><strong>Age:</strong> " + age + "</p>");
			out.println("<p><strong>Course:</strong> " + course + "</p>");
		}
	}
}
