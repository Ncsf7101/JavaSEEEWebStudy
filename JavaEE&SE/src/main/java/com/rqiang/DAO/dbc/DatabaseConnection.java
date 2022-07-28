package com.rqiang.DAO.dbc;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    private static final String DBNAME = "java:comp/env/jdbc/rqiang";
    private Connection conn = null;
    public DatabaseConnection() throws Exception{
        try{
            Context ctx = new InitialContext();
            DataSource ds = (DataSource) ctx.lookup(DBNAME);
            conn = ds.getConnection();
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
