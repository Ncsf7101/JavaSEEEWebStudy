package com.rqiang.Java12;

import java.io.*;


public class InputStream1{
        public static void main(String[] args) throws Exception {

        File file = new File("E:"+ File.separator +"JavaFile"+ File.separator  + "Hello World.txt");
        InputStream input = null;
        input = new FileInputStream(file);
        byte b[] = new byte[1024];
        //input.read("Hello World".getBytes());
        int a = input.read(b);
        System.out.println(new String(b, 0, a));
        input.close();

        }
        public static void main2(String[] args) throws Exception {

                File file = new File("E:"+ File.separator +"JavaFile"+ File.separator  + "Hello World.txt");
                OutputStream output = null;
                output = new FileOutputStream(file);
                output.write("Hello World".getBytes());
                output.close();

        }
}
