package com.rqiang.struts;

import org.apache.struts.action.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InputAction extends Action {
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        InputForm inputForm = (InputForm) form;
        if(super.isTokenValid(request)){
            System.out.println("输入内容：" + inputForm.getInfo());
            super.resetToken(request);
        }else {
            ActionMessages errors = new ActionMessages();
            errors.add("token", new ActionMessage("error.token"));
            this.saveErrors(request, errors);
            return mapping.getInputForward();
        }
        return null;
    }
}
