package com.rqiang.Tag.tagdemo;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class HelloTag extends TagSupport {
    @Override
    public int doStartTag() throws JspException {
        JspWriter out = super.pageContext.getOut();
        try{
            out.print("<h1>Hello World!!!</h1>");
        }catch (Exception e){
            e.printStackTrace();
        }
        return TagSupport.SKIP_BODY;
    }
}
