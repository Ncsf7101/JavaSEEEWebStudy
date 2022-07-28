package com.rqiang.Java17.lobdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BlobDemo01 {
    public static final String DBDRIVER = "org.gjt.mm.mysql.Driver";
    public static final String DBURL = "jdbc:mysql://localhost:3306/db_book";
    public static final String DBUSER = "root";
    public static final String DBPWD = "123456";

    public static void main(String[] args) throws Exception {
        Connection conn = null;
        PreparedStatement pstat = null;
        String name = "rqiang";
        File f = new File("C:\\Users\\Ncsf7101\\Desktop\\封面111.png");
        InputStream inp = new FileInputStream(f);
        Class.forName(DBDRIVER);
        conn = DriverManager.getConnection(DBURL, DBUSER, DBPWD);
        String sql = "INSERT INTO userblob(name, photo) VALUES (?, ?)";
        pstat = conn.prepareStatement(sql);
        pstat.setString(1, name);
        pstat.setBinaryStream(2, inp, f.length());
        pstat.executeUpdate();
        inp.close();
        pstat.close();
        conn.close();
    }


}
