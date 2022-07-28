package com.rqiang.struts;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

public class HelloForm extends ActionForm {
    private String info;
    public ActionErrors validate(ActionMapping mapping,
                                 HttpServletRequest request){
        ActionErrors errors = new ActionErrors();
        if(this.info == null || "".equals(this.info)){
            errors.add("info", new ActionMessage("error.info"));
        }
        return errors;
    }

    public void reset(ActionMapping mapping, ServletRequest request) {
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
