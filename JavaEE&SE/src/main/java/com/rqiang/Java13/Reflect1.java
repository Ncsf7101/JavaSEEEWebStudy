package com.rqiang.Java13;


import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class X{
    public void say(){
        System.out.println("Hello");
    }
}

public class Reflect1 {
    public static void main2(String[] args) {
        Class<?> c1 = null;
        Object obj = null;
        try {
            c1 = Class.forName("com.rqiang.Java13.X");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            obj = c1.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        try {
            Method method = c1.getMethod("say");
            method.invoke(obj);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void sub1(){
        String a = "sda.asdas.sadasd.aaa";
        System.out.println(a.substring(a.lastIndexOf(".")+1));
    }

    @Test
    public void arrayOut() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte data[] = "asdfgh".getBytes();
        byte data2[] = new byte[1024];
        InputStream inp = new ByteArrayInputStream(data);
        int len = 0;
        while(((len = inp.read(data2))!= -1)){
            bos.write(data2, 0, len);
            System.out.println("----------------");
            System.out.println(len);
            System.out.println("----------------");

        }
        byte data3[] = null;
        data3 = bos.toByteArray();


        System.out.println("data3" + new String(data3));
        System.out.println("data2" + new String(data2));
        bos.close();
        inp.close();

    }
}
