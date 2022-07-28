package com.rqiang.Java11;

import java.io.IOException;

public class StringBufferDemo{
    public static void main(String[] args) {
        Runtime run = Runtime.getRuntime();
        System.out.println(run.maxMemory());
        System.out.println(run.freeMemory());
        StringBuffer buf1 = new StringBuffer();
        buf1.append("!!2");
        buf1.insert(buf1.length()-1, "111");
        System.out.println(buf1);
        String str = "1";
        for(int i =0; i<4000;i++) {
            str += i;
        }
        Process pro = null;
        try {
            pro = run.exec("notepad.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        pro.destroy();
        System.out.println(run.freeMemory());
        run.gc();
        System.out.println(run.freeMemory());

    }
}
