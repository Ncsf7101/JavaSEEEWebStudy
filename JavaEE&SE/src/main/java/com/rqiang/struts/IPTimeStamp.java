package com.rqiang.struts;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class IPTimeStamp {
    private SimpleDateFormat sdf = null;

    public String getIPTimeRand(){
        StringBuffer buf = new StringBuffer();
        buf.append(this.getTimeStamp());
        Random r = new Random();
        for(int i = 0; i < 3; i++){
            buf.append(r.nextInt(10));
        }
        return buf.toString();
    }

    private String addZero(String str, int len){
        StringBuffer s = new StringBuffer();
        s.append(str);
        while(s.length() < len){
            s.insert(0, "0");
        }
        return s.toString();
    }
    public String getDate(){
        this.sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.sss");
        return this.sdf.format(new Date());
    }

    public String getTimeStamp(){
        this.sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        return this.sdf.format(new Date());
    }

}
