package com.itheima.controller;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class MyServlet extends HttpServlet {


    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println(config);
        super.init(config);
    }
}
