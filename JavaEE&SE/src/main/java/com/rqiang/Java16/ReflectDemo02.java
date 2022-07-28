package com.rqiang.Java16;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class ReflectDemo02 {
    public static void main(String[] args) throws Exception {
        Class<?> c = null;
        c = Class.forName("com.rqiang.Java16.SimpleBeanTwo");
        Method toM = c.getMethod("toString");
        if(toM.isAnnotationPresent(MyDefaultAnnotationReflect.class)){
            MyDefaultAnnotationReflect my = null;
            my = toM.getAnnotation(MyDefaultAnnotationReflect.class);
            String key = my.key();
            String value = my.value();
            System.out.println("key=" + key);
            System.out.println("value=" + value);
        }

    }
}
