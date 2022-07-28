package com.rqiang.JavaWeb.fileupdate;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.*;

public class FileUploadTools {
    private HttpServletRequest request = null;
    private List<FileItem> items = null;
    private Map<String, List<String>> params = new HashMap<String, List<String>>();
    private Map<String, FileItem> files = new HashMap<String, FileItem>();
    private int maxSize = 3145728;
    public FileUploadTools(HttpServletRequest request, int maxSize, String tempDir) throws Exception{
        this.request = request;
        DiskFileItemFactory factory = new DiskFileItemFactory();
        if(tempDir != null){
            factory.setRepository(new File(tempDir));
        }
        ServletFileUpload upload = new ServletFileUpload(factory);
        if(maxSize > 0){
            this.maxSize = maxSize;
        }
        upload.setFileSizeMax(this.maxSize);
        try{
            this.items = upload.parseRequest(request);
        }catch (FileUploadException e){
            throw e;
        }
        this.init();
    }
    private void init(){
        Iterator<FileItem> iter = this.items.iterator();
        IPTimeStamp its = new IPTimeStamp();
        while(iter.hasNext()){
            FileItem item = iter.next();
            if(item.isFormField()){
                String name = item.getFieldName();
                String value = item.getString();
                List<String> temp = null;
                if(this.params.containsKey(name)){
                    temp = this.params.get(name);
                }else {
                    temp = new ArrayList<String>();
                }
                temp.add(value);
                this.params.put(name, temp);
            }else{
                String fileName = its.getIPTimeRand() + "." + item.getName().split("\\.")[1];
                this.files.put(fileName, item);
            }
        }
    }
    public String getParameter(String name){
        String ret = null;
        List<String> temp = this.params.get(name);
        if(temp != null){
            ret = temp.get(0);
        }
        return ret;
    }
    public String[] getParameterValues(String name){
        String ret[] = null;
        List<String> temp = this.params.get(name);
        if(temp != null){
            ret = temp.toArray(new String[]{});
        }
        return ret;
    }
    public Map<String, FileItem> getUploadFiles(){
        return this.files;
    }
}
