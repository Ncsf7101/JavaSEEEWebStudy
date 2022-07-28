package com.rqiang.Java12;

import java.io.*;

public class PrintStream1 {
    public static void main1(String[] args) throws IOException {
        OutputStream out = System.out;
        byte[] bs = "Hello World".getBytes();
        out.write(bs);
        out.close();
    }

    public static void main2(String[] args) throws IOException {
        InputStream in = System.in;
        byte[] bs = new byte[1024];
        int len = 0;
        try {
            len = in.read(bs);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(new String(bs, 0, len));
        in.close();
    }

    public static void main3(String[] args) throws Exception {
        System.setOut(new PrintStream(new FileOutputStream("E:"+ File.separator +"JavaFile" + File.separator + "Hello1.txt")));
        byte[] bs = new byte[1024];
        System.in.read(bs);
        System.out.println(new String(bs));
        System.out.flush();
    }

    public static void main(String[] args) {
        String str = "11";
        if(str.matches("\\d+$")){
            System.out.println("1111");
        }
    }
}
