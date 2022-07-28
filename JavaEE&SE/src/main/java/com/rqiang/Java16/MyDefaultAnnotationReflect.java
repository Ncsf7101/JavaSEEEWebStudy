package com.rqiang.Java16;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyDefaultAnnotationReflect {
    public String key() default "Zou";
    public String value() default "rqiang";
}
