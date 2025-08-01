package com.aurinpro.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/courses")
public class CourseServlet extends HttpServlet {

	private static final Map<String, List<String>> departmentCourses = new HashMap<>();

	static {
		departmentCourses.put("CS", Arrays.asList("Data Structures", "Operating Systems", "Java Programming"));
		departmentCourses.put("ME", Arrays.asList("Thermodynamics", "Fluid Mechanics", "Machine Design"));
		departmentCourses.put("EE", Arrays.asList("Circuit Theory", "Power Systems", "Control Engineering"));
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String dept = request.getParameter("department");

		if (dept == null || dept.trim().isEmpty()) {
			out.println("<h3 style='color:red;'>Please select a department!</h3>");
			return;
		}

		dept = dept.trim().toUpperCase();

		if (departmentCourses.containsKey(dept)) {
			List<String> courses = departmentCourses.get(dept);

			out.println("<h2>Courses for " + dept + " Department:</h2>");
			out.println("<ul>");
			for (String course : courses) {
				out.println("<li>" + course + "</li>");
			}
			out.println("</ul>");
		} else {
			out.println("<h3 style='color:red;'>Invalid department. No courses available.</h3>");
		}
	}
}
