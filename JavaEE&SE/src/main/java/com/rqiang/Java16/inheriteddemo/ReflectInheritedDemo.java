package com.rqiang.Java16.inheriteddemo;

import java.lang.annotation.Annotation;

public class ReflectInheritedDemo {
    public static void main(String[] args) throws Exception{
        Class<?> c = null;
        c = Class.forName("com.rqiang.Java16.inheriteddemo.Student");
        Annotation an[] = c.getAnnotations();
        if(c.isAnnotationPresent(MyIA.class)){
            MyIA myIA = null;
            myIA = c.getAnnotation(MyIA.class);
            String name = myIA.name();
            System.out.println(name);
        }
    }
}
