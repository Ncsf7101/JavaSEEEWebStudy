package com.rqiang.Java17.lobdemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.*;

public class BlobDemo02 {
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
                    + File.separator + "copyPhoto.png");
            InputStream inp = rsult.getBinaryStream(1);
            OutputStream out = new FileOutputStream(f);
            int len = 0;
            while((len = inp.read()) != -1){
                out.write(len);
            }
            inp.close();
            out.close();
        }
        rsult.close();
        pstat.close();
        conn.close();
    }
}
