package com.rqiang.Servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServerRedirectDemo extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession().setAttribute("name", "荣强");
        req.setAttribute("info", "rqiang");
        RequestDispatcher rd = req.getRequestDispatcher("get_info.jsp");
        rd.forward(req, resp);
        //resp.sendRedirect("get_info.jsp"); //客户端跳转
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
