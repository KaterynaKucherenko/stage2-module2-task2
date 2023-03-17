package com.example.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import java.time.LocalDateTime;

@WebListener
public class ContextListener implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        se.getSession().setAttribute("servletTimeInit", LocalDateTime.now());
    }
}

