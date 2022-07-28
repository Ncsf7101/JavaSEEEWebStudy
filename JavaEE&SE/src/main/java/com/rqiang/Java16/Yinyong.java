package com.rqiang.Java16;

@FunctionalInterface
interface IMessage<P, R>{
    public R zhuanhuan(P p);
}

public class Yinyong {
    public static void main(String[] args) {
        IMessage<Integer, String> msg = String::valueOf;
        String str = msg.zhuanhuan(5);
        System.out.println(str.replace("5", "10"));
    }
}
