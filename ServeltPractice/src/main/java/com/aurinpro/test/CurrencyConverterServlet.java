package com.aurinpro.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/convert")
public class CurrencyConverterServlet extends HttpServlet {

	private static final Map<String, Double> exchangeRates = new HashMap<>();

	static {
		exchangeRates.put("USD_INR", 83.0);
		exchangeRates.put("INR_USD", 1 / 83.0);
		exchangeRates.put("USD_EUR", 0.91);
		exchangeRates.put("EUR_USD", 1.10);
		exchangeRates.put("INR_EUR", 0.011);
		exchangeRates.put("EUR_INR", 90.0);
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String amountStr = request.getParameter("amount");
		String from = request.getParameter("from");
		String to = request.getParameter("to");

		if (amountStr == null || from == null || to == null || amountStr.isEmpty() || from.isEmpty() || to.isEmpty()) {
			out.println("<h3 style='color:red;'>All parameters (amount, from, to) are required!</h3>");
			return;
		}

		try {
			double amount = Double.parseDouble(amountStr);

			if (amount <= 0) {
				out.println("<h3 style='color:red;'>Amount must be greater than 0!</h3>");
				return;
			}

			if (from.equalsIgnoreCase(to)) {
				out.println("<h3 style='color:blue;'>Same currency selected. Converted amount is: " + amount + " " + to
						+ "</h3>");
				return;
			}

			String key = from.toUpperCase() + "_" + to.toUpperCase();
			Double rate = exchangeRates.get(key);

			if (rate == null) {
				out.println(
						"<h3 style='color:red;'>Conversion rate not available for: " + from + " to " + to + "</h3>");
				return;
			}

			double converted = amount * rate;
			out.printf("<h2>Converted Amount: %.2f %s = %.2f %s</h2>", amount, from.toUpperCase(), converted,
					to.toUpperCase());

		} catch (NumberFormatException e) {
			out.println("<h3 style='color:red;'>Invalid amount format!</h3>");
		}
	}
}
