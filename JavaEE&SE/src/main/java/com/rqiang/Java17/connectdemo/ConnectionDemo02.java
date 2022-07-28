package com.rqiang.Java17.connectdemo;


import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDemo02 {
    public static final String DBDRIVER = "org.gjt.mm.mysql.Driver";
    public static final String DBURL = "jdbc:mysql://localhost:3306/db_book";
    public static final String DBUSER = "root";
    public static final String DBPWD = "123456";

    public static void main(String[] args) throws Exception {
        Connection conn = null;
        Class.forName(DBDRIVER);
        conn = DriverManager.getConnection(DBURL, DBUSER, DBPWD);
        System.out.println(conn);
        conn.close();
    }
}
