package com.rqiang.DAO.dbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection2 {
    private static final String DBDRIVER = "org.gjt.mm.mysql.Driver";
    private static final String DBURL = "jdbc:mysql://localhost:3306/db_javaweb";
    private static final String DBUSER = "root";
    private static final String DBPASSWORD = "123456";
    private Connection conn = null;
    public DatabaseConnection2() throws Exception{
        try{
            Class.forName(DBDRIVER);
            conn = DriverManager.getConnection(DBURL, DBUSER, DBPASSWORD);
        }catch (Exception e){
            throw e;
        }
    }
    public Connection getConnection(){
        return this.conn;
    }
    public void close() throws Exception{
        if(this.conn != null){
            try{
                this.conn.close();
            }catch (Exception e){
                throw e;
            }
        }
    }
}
