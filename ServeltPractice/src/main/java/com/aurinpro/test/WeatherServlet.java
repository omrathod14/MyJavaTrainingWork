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

@WebServlet("/weather")
public class WeatherServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String city = request.getParameter("city");

		if (city == null || city.trim().isEmpty()) {
			out.println("<h3 style='color:red;'>City name cannot be empty!</h3>");
			return;
		}

		city = city.trim().toLowerCase();

		Map<String, String[]> weatherData = new HashMap<>();
		weatherData.put("delhi", new String[] { "38°C", "20%", "Sunny" });
		weatherData.put("mumbai", new String[] { "32°C", "70%", "Humid" });
		weatherData.put("bangalore", new String[] { "28°C", "60%", "Cloudy" });
		weatherData.put("chennai", new String[] { "36°C", "65%", "Hot" });

		if (weatherData.containsKey(city)) {
			String[] data = weatherData.get(city);
			out.println("<h2>Weather for " + capitalize(city) + ":</h2>");
			out.println("<ul>");
			out.println("<li>Temperature: " + data[0] + "</li>");
			out.println("<li>Humidity: " + data[1] + "</li>");
			out.println("<li>Forecast: " + data[2] + "</li>");
			out.println("</ul>");
		} else {
			out.println("<h3 style='color:red;'>Invalid city name or no data available!</h3>");
		}
	}

	private String capitalize(String str) {
		if (str == null || str.isEmpty())
			return str;
		return str.substring(0, 1).toUpperCase() + str.substring(1);
	}
}
