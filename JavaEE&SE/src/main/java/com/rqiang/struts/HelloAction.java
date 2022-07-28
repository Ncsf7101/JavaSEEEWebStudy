package com.rqiang.struts;

import org.apache.struts.action.*;
import com.rqiang.struts.HelloForm;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloAction extends Action {


    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        HelloForm helloForm = (HelloForm) form;
        String info = helloForm.getInfo();
        if(info.length()>15){
            ActionErrors errors = new ActionErrors();
            errors.add("info", new ActionMessage("msg.info"));
            super.saveMessages(request, errors);
            return mapping.getInputForward();
        }else{
            request.setAttribute("msg", info);
        }
        return mapping.findForward("show");
    }
}
