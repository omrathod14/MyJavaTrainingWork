package com.aurionpro.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AuthFilter implements Filter {
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest request = (HttpServletRequest) req;
		HttpSession session = request.getSession(false);

		if (session == null || session.getAttribute("studentName") == null) {
			((HttpServletResponse) res).sendRedirect("index.html");
		} else {
			chain.doFilter(req, res);
		}
	}
}
