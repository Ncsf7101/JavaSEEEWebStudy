package com.rqiang.Java17.lobdemo;

import java.io.InputStream;
import java.sql.*;
import java.util.Scanner;

public class ClobDemo03 {
    public static final String DBDRIVER = "org.gjt.mm.mysql.Driver";
    public static final String DBURL = "jdbc:mysql://localhost:3306/db_book";
    public static final String DBUSER = "root";
    public static final String DBPWD = "123456";

    public static void main(String[] args) throws Exception {
        Connection conn = null;
        PreparedStatement prestat = null;
        StringBuffer strb = new StringBuffer();
        int id = 1;
        String sql = "SELECT name, note FROM userclob WHERE id=?";
        Class.forName(DBDRIVER);
        conn = DriverManager.getConnection(DBURL, DBUSER, DBPWD);
        prestat = conn.prepareStatement(sql);
        prestat.setInt(1, id);
        ResultSet rset = prestat.executeQuery();

        while(rset.next()){
            Clob cl = rset.getClob(2);
            InputStream inp = cl.getAsciiStream();
            Scanner scan = new Scanner(inp);
            scan.useDelimiter("\r\n");
            while(scan.hasNext()){
                strb.append(scan.next()).append("\n");
            }
            System.out.println(strb);
        }
        rset.close();
        prestat.close();
        conn.close();
    }
}
