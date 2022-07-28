package com.rqiang.Java17.statementdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteDemo {
    public static final String DBDRIVER = "org.gjt.mm.mysql.Driver";
    public static final String DBURL = "jdbc:mysql://localhost:3306/db_book";
    public static final String DBUSER = "root";
    public static final String DBPWD = "123456";

    public static void main(String[] args) throws Exception {
        Connection conn = null;
        Statement stat = null;
        int id = 3;
        String sql = "DELETE FROM user WHERE id=" + id;
        System.out.println(sql);


        Class.forName(DBDRIVER);
        conn = DriverManager.getConnection(DBURL, DBUSER, DBPWD);
        stat = conn.createStatement();
        stat.executeUpdate(sql);
        stat.close();
        conn.close();
    }
}
