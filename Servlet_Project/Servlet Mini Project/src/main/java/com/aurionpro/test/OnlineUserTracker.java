package com.aurionpro.test;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.*;
import javax.servlet.*;

@WebListener
public class OnlineUserTracker implements HttpSessionListener {

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		ServletContext context = se.getSession().getServletContext();
		Integer count = (Integer) context.getAttribute("onlineCount");
		if (count == null)
			count = 0;
		context.setAttribute("onlineCount", count + 1);
		System.out.println("[OnlineUserTracker] Session created. Online users: " + (count + 1));
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		ServletContext context = se.getSession().getServletContext();
		Integer count = (Integer) context.getAttribute("onlineCount");
		if (count == null || count <= 0)
			count = 0;
		else
			count = count - 1;
		context.setAttribute("onlineCount", count);
		System.out.println("[OnlineUserTracker] Session destroyed. Online users: " + count);
	}
}
