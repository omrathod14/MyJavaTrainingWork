package com.aruionpro.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class LoginHtml extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("username");
		String pass = req.getParameter("password");

		PrintWriter pw = resp.getWriter();

		if (name.equals("Om") && pass.equals("1234")) {
			pw.write("You have logged in successfully");
		} else {
			pw.write("Invalid credentials!");
		}
	}

}
