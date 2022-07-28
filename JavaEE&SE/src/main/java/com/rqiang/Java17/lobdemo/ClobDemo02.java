package com.rqiang.Java17.lobdemo;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;

public class ClobDemo02 {
    public static final String DBDRIVER = "org.gjt.mm.mysql.Driver";
    public static final String DBURL = "jdbc:mysql://localhost:3306/db_book";
    public static final String DBUSER = "root";
    public static final String DBPWD = "123456";

    public static void main(String[] args) throws Exception {
        Connection conn = null;
        PreparedStatement prestat = null;
        int id = 1;
        String sql = "SELECT name, note FROM userclob WHERE id=?";
        Class.forName(DBDRIVER);
        conn = DriverManager.getConnection(DBURL, DBUSER, DBPWD);
        prestat = conn.prepareStatement(sql);
        prestat.setInt(1, id);
        ResultSet rset = prestat.executeQuery();
        while(rset.next()){
            Clob cl = rset.getClob(2);

            cl.truncate(100);
            String note = cl.getSubString(1, (int) cl.length());
            System.out.println(note);
        }
        rset.close();
        prestat.close();
        conn.close();
    }
}
