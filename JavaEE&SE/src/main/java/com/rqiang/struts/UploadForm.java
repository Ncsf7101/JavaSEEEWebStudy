package com.rqiang.struts;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;

import javax.servlet.http.HttpServletRequest;

public class UploadForm extends ActionForm {
    private FormFile photo;

    @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        return null;
    }

    @Override
    public void reset(ActionMapping mapping, HttpServletRequest request) {

    }

    public void setPhoto(FormFile photo) {
        this.photo = photo;
    }

    public FormFile getPhoto() {
        return photo;
    }
}
