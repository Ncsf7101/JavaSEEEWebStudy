package com.rqiang.Java12.InfoManage;

import java.io.*;

public class InputData {

    public String getString(String info) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(info);
        String tmp = input.readLine();
        return tmp;
    }

    public int getInt(String info, String err) throws Exception {
        String tmp = null;
        int num = 0;
        boolean flag = true;
        while(flag){
            tmp = this.getString(info);
            if (tmp.matches("^[0-6]{1}$")) {
                num = Integer.valueOf(tmp);
                flag = false;
            }else{
                System.out.println(err);
            }
        }
        return num;
    }

    public int getAge(String info, String err) throws Exception {
        String tmp = null;
        int num = 0;
        boolean flag = true;
        while(flag){
            tmp = this.getString(info);
            if (tmp.matches("^\\d+$")) {
                num = Integer.valueOf(tmp);
                flag = false;
            }else{
                System.out.println(err);
            }
        }
        return num;
    }

}
