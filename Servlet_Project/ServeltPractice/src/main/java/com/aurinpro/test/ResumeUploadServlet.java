package com.aurinpro.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/uploadResume")
public class ResumeUploadServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String resumeText = request.getParameter("resumeText");
        String skills = request.getParameter("skills");

        // Basic validations
        if (name == null || name.trim().length() < 2) {
            out.println("<h3 style='color:red;'>Name must be at least 2 characters long.</h3>");
            return;
        }

        if (email == null || !email.matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$")) {
            out.println("<h3 style='color:red;'>Invalid email format.</h3>");
            return;
        }

        if (skills == null || skills.trim().isEmpty()) {
            out.println("<h3 style='color:red;'>At least one skill must be provided.</h3>");
            return;
        }

        // Parse skills
        String[] skillList = skills.split(",");

        // Display structured preview
        out.println("<h2>Resume Preview</h2>");
        out.println("<p><strong>Name:</strong> " + name + "</p>");
        out.println("<p><strong>Email:</strong> " + email + "</p>");

        out.println("<p><strong>Resume Text:</strong></p>");
        out.println("<pre>" + resumeText + "</pre>");

        out.println("<p><strong>Skills:</strong></p><ul>");
        for (String skill : skillList) {
            out.println("<li>" + skill.trim() + "</li>");
        }
        out.println("</ul>");
    }
}
