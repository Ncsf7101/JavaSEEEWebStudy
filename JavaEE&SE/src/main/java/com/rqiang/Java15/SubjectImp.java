package com.rqiang.Java15;

public class SubjectImp implements Subject {

    @Override
    public String say(String name, int age) {
        return "姓名：" + name + "年龄：" + age;
    }
}
