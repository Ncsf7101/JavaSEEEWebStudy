package com.rqiang.Java17.lobdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClobDemo01 {
    public static final String DBDRIVER = "org.gjt.mm.mysql.Driver";
    public static final String DBURL = "jdbc:mysql://localhost:3306/db_book";
    public static final String DBUSER = "root";
    public static final String DBPWD = "123456";

    public static void main(String[] args) throws Exception {
        Connection conn = null;
        PreparedStatement prestat = null;
        String name = "Zrqiang";
        String sql = "INSERT INTO userclob(name, note)" +
                " VALUES(?, ?)";
        Class.forName(DBDRIVER);
        conn = DriverManager.getConnection(DBURL, DBUSER, DBPWD);
        prestat = conn.prepareStatement(sql);
        prestat.setString(1, name);
        File f = new File("C:" + "\\" + "Users\\Ncsf7101\\Desktop\\新建文本文档 (3).txt");
        InputStream input = new FileInputStream(f);
        prestat.setAsciiStream(2, input, f.length());
        prestat.executeUpdate();
        prestat.close();
        conn.close();
    }
}
