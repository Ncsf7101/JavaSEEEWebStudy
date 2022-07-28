package com.rqiang.JavaWeb.JavaBean;

public class SimpleBean {
    private String name;
    private int age;

    public SimpleBean(){
        System.out.println("---------------------初始化成功");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
