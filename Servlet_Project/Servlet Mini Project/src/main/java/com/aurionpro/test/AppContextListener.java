package com.aurionpro.test;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class AppContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        sce.getServletContext().setAttribute("onlineCount", 0);
        System.out.println("[AppContextListener] Initialized onlineCount to 0");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        // No cleanup needed
    }
}


