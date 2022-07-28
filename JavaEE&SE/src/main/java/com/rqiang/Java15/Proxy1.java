package com.rqiang.Java15;

public class Proxy1 {
    public static void main(String[] args) {
        MyInvocationHandler handler = new MyInvocationHandler();
        Subject sub = (Subject) handler.bind(new SubjectImp());
        String info = sub.say("邹荣强", 25);
        System.out.println(info);
    }
}
