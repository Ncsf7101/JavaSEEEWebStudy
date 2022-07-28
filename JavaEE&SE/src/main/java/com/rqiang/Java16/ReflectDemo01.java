package com.rqiang.Java16;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class ReflectDemo01 {
    @MyTargetAnnotation
    public static void main(String[] args) throws Exception {
        Class<?> c = null;
        c = Class.forName("com.rqiang.Java16.SimpleBeanOne");
        Method toM = c.getMethod("toString");
        Annotation an[] = toM.getAnnotations();
        for(Annotation a:an){
            System.out.println(a);
        }

        Object b = c.newInstance();
        System.out.println(b.toString());
    }
}
