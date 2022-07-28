package com.rqiang.Servlet;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpSession ses = req.getSession();
        if(ses.getAttribute("userid") != null){

            filterChain.doFilter(servletRequest, servletResponse);
        }else {
            System.out.println("用户名不能为空");
            servletRequest.getRequestDispatcher("login.jsp").forward(servletRequest, servletResponse);
        }

    }

    @Override
    public void destroy() {
    }
}
