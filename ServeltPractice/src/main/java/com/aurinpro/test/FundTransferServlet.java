package com.aurinpro.test;


import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/fundTransfer")
public class FundTransferServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String sourceAcc = request.getParameter("sourceAcc");
        String destAcc = request.getParameter("destAcc");
        String amtStr = request.getParameter("amount");

        // Validation
        if (sourceAcc == null || destAcc == null || amtStr == null ||
            sourceAcc.isEmpty() || destAcc.isEmpty() || amtStr.isEmpty()) {
            out.println("<h3 style='color:red;'>All fields are required!</h3>");
            return;
        }

        if (sourceAcc.equals(destAcc)) {
            out.println("<h3 style='color:red;'>Source and Destination accounts must be different!</h3>");
            return;
        }

        double amount = Double.parseDouble(amtStr);
        if (amount <= 0 || amount > 50000) {
            out.println("<h3 style='color:red;'>Amount must be positive and ≤ ₹50,000</h3>");
            return;
        }

        // Dummy success
        out.println("<h2>Transaction Successful!</h2>");
        out.println("<p>Transferred :Rs " + amount + "</p>");
        out.println("<p>From Account: " + sourceAcc + "</p>");
        out.println("<p>To Account: " + destAcc + "</p>");
    }
}

