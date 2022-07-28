package com.rqiang.Servlet;

import jdk.nashorn.internal.runtime.regexp.joni.Config;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class InitParamServlet extends HttpServlet {
    private String initParam = null;

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.initParam = config.getInitParameter("ref");
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("初始化参数: " + this.initParam);
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
