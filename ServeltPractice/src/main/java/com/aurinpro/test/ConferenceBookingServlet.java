package com.aurinpro.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/conference")
public class ConferenceBookingServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Set response content type
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Get form data
        String name = request.getParameter("attendeeName");
        String email = request.getParameter("email");
        String seatsStr = request.getParameter("seats");
        String date = request.getParameter("date");
        String sessionType = request.getParameter("sessionType");

        // Basic validations
        int seats = 0;
        try {
            seats = Integer.parseInt(seatsStr);
            if (seats < 1 || seats > 5) {
                out.println("<h3 style='color:red;'>You can only book between 1 to 5 seats.</h3>");
                return;
            }
        } catch (NumberFormatException e) {
            out.println("<h3 style='color:red;'>Invalid number of seats.</h3>");
            return;
        }

        if (name.isEmpty() || email.isEmpty() || sessionType.isEmpty() || date.isEmpty()) {
            out.println("<h3 style='color:red;'>All fields are required.</h3>");
            return;
        }

        // Show confirmation
        out.println("<h2 style='color:green;'>Booking Confirmed!</h2>");
        out.println("<p><strong>Name:</strong> " + name + "</p>");
        out.println("<p><strong>Email:</strong> " + email + "</p>");
        out.println("<p><strong>Seats:</strong> " + seats + "</p>");
        out.println("<p><strong>Date:</strong> " + date + "</p>");
        out.println("<p><strong>Session:</strong> " + sessionType + "</p>");
        out.println("<p style='color:blue;'>Thank you for registering! We look forward to seeing you.</p>");
    }
}

