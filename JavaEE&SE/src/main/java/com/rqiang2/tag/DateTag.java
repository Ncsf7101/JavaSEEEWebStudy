package com.rqiang2.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTag extends TagSupport {
    private String format;

    @Override
    public int doStartTag() throws JspException {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        try{
            super.pageContext.getOut().write(sdf.format(new Date()));
        }catch (Exception e){
            e.printStackTrace();
        }
        return SKIP_BODY;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
