package com.rqiang.Java17.connectdemo;

public class ConnectionDemo01 {
    public static final String DBDRIVER = "org.gjt.mm.mysql.Driver";

    public static void main(String[] args) throws Exception {
        Class<?> c = null;
        c = Class.forName(DBDRIVER);
    }
}
