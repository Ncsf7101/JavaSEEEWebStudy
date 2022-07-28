package com.rqiang.Java17.metaData;

import java.sql.*;

public class ResultSetMetaDemo {
    public static final String DBDRIVER = "org.gjt.mm.mysql.Driver";
    public static final String DBURL = "jdbc:mysql://localhost:3306/db_book";
    public static final String DBUSER = "root";
    public static final String DBPWD = "123456";

    public static void main(String[] args) throws Exception{
        Connection conn = null;
        PreparedStatement pstat = null;
        ResultSet rset = null;
        ResultSetMetaData rsetdata = null;
        int id = 1;
        String sql = "SELECT * FROM user";
        Class.forName(DBDRIVER);
        conn = DriverManager.getConnection(DBURL, DBUSER, DBPWD);
        pstat = conn.prepareStatement(sql);
        rset = pstat.executeQuery();
        rsetdata = pstat.getMetaData();
        System.out.println("数据列数 = " + rsetdata.getColumnCount());
        while(rset.next()){
            for(int i = 1; i<=rsetdata.getColumnCount(); i++)
                System.out.println(rset.getString(i));
        }
        pstat.close();
        conn.close();
    }
}
