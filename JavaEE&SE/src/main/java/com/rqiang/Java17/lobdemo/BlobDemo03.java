package com.rqiang.Java17.lobdemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.*;

public class BlobDemo03 {
    public static final String DBDRIVER = "org.gjt.mm.mysql.Driver";
    public static final String DBURL = "jdbc:mysql://localhost:3306/db_book";
    public static final String DBUSER = "root";
    public static final String DBPWD = "123456";

    public static void main(String[] args) throws Exception {
        Connection conn = null;
        PreparedStatement pstat = null;
        ResultSet rsult = null;
        int id = 1;
        String sql = "SELECT photo FROM userblob WHERE id=?";
        Class.forName(DBDRIVER);
        conn = DriverManager.getConnection(DBURL, DBUSER, DBPWD);
        pstat = conn.prepareStatement(sql);
        pstat.setInt(1, id);
        rsult = pstat.executeQuery();
        if(rsult.next()){
            File f = new File("E:" + File.separator + "JavaFile"
                    + File.separator + "copyPhoto2.png");
            Blob blob = rsult.getBlob(1);
            OutputStream out = new FileOutputStream(f);
            out.write(blob.getBytes(1, (int) blob.length()));
            out.close();
        }
        rsult.close();
        pstat.close();
        conn.close();
    }
}
