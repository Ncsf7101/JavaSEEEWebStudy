package com.rqiang.Servlet;


import javax.servlet.*;
import java.io.IOException;

public class SimpleFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        String initParam = filterConfig.getInitParameter("ref");
        System.out.println("过滤器初始化, 初始化参数 = " + initParam);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("执行前doFilter");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("执行后doFilter");
    }

    @Override
    public void destroy() {
        System.out.println("过滤器销毁");
    }
}
