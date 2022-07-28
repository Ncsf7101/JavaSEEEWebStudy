package com.rqiang.Java16.JavaDoc1;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface MyDocumentedAnnotation {
    public String key();
    public String value();
}
