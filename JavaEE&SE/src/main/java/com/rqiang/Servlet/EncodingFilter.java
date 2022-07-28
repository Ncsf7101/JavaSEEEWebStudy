package com.rqiang.Servlet;


import javax.servlet.*;
import java.io.IOException;

public class EncodingFilter implements Filter {
    private String charSet = null;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.charSet = filterConfig.getInitParameter("charset");
        System.out.println("encodingFilter 初始化: " + this.charSet);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding(this.charSet);
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
    }
}
