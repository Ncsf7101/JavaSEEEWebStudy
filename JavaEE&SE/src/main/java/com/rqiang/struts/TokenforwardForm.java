package com.rqiang.struts;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;

public class TokenforwardForm extends ActionForm {
    @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        return null;
    }

    @Override
    public void reset(ActionMapping mapping, HttpServletRequest request) {

    }
}
