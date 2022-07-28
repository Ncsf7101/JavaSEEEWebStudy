package com.rqiang.Java17.statementdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertDemo1 {
    public static final String DBDRIVER = "org.gjt.mm.mysql.Driver";
    public static final String DBURL = "jdbc:mysql://localhost:3306/db_book";
    public static final String DBUSER = "root";
    public static final String DBPWD = "123456";

    public static void main(String[] args) throws Exception {
        Connection conn = null;
        Statement stat = null;
        String sql = "INSERT INTO user(name, password, age, sex, birthday) "+
                "VALUES('占哥', '123456', 25, '男', '2022-06-27')";
        Class.forName(DBDRIVER);
        conn = DriverManager.getConnection(DBURL, DBUSER, DBPWD);
        stat = conn.createStatement();
        stat.executeUpdate(sql);
        stat.close();
        conn.close();
    }
}
