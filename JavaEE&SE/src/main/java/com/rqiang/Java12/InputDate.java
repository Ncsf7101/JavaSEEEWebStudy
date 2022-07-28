package com.rqiang.Java12;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class InputData1{
    public static final int i1 = 0;
    private BufferedReader buf = null;
    public InputData1(){
        buf = new BufferedReader(new InputStreamReader(System.in));
    }
    public String getString(String info){
        String temp = null;
        System.out.println(info);
        try{
            temp = buf.readLine();
        }catch (Exception e){
            e.printStackTrace();
        }
        return temp;
    }
    public int getInt(String info, String err){
        int temp = 0;
        String str = null;
        boolean flag = true;
        while(flag){
            str = this.getString(info);
            if(str.matches("^\\d+$")){
                temp = Integer.valueOf(str);
                flag = false;
            }else{
                System.out.println(err);
            }
        }
        return temp;
    }
}

public class InputDate {
    public static void main(String[] args) throws Exception{
        int i = 0;
        int j = 0;
        InputData1 input = new InputData1();
        i = input.getInt("1数字", "非法输入");
        j = input.getInt("2数字", "非法输入");
        System.out.println(i + " + " + j + " = " + (i+j));
    }
}
