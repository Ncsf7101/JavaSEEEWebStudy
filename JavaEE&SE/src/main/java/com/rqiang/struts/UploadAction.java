package com.rqiang.struts;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class UploadAction extends Action {
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        UploadForm uploadForm = (UploadForm) form;
        IPTimeStamp its = new IPTimeStamp();
        String fileName = its.getIPTimeRand() + "." + uploadForm.getPhoto().getFileName().split("\\.")[uploadForm.getPhoto().getFileName().split("\\.").length-1];

        System.out.println(uploadForm.getPhoto().getFileName());
        System.out.println(fileName);
        System.out.println(super.getServlet().getServletContext().getRealPath("/") +
                "upload" + File.separator + fileName);
        try{
            File outFile = new File(super.getServlet().getServletContext().getRealPath("/") +
                    "upload" + File.separator + fileName);
            InputStream input = uploadForm.getPhoto().getInputStream();
            OutputStream output = new FileOutputStream(outFile);
            byte data[] = new byte[1024];
            int temp = 0;
            while((temp = input.read(data, 0, 1024)) != -1){
                output.write(data);
            }
            output.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
//    @Test
//    public void test(){
//        String[] strs = "www.text".split("\\.");
//        for (String str:strs) {
//            System.out.println(strs[strs.length-1]);
//        }
//    }
}
