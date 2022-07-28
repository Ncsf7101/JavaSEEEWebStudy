package com.rqiang.Java16.JavaDoc1;

import com.rqiang.Java16.JavaDoc1.MyDocumentedAnnotation;

@MyDocumentedAnnotation(key = "Zou", value = "Rqiang")
public class SimpleBeanDocumented {

    @MyDocumentedAnnotation(key = "Zou", value = "Rqiang")
    public String toString(){
        return "Hello ZouRqiang";
    }
}
