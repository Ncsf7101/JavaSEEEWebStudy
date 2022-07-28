package com.rqiang2.ajax;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CheckServlet extends HttpServlet {
    private static final String DBNAME = "java:comp/env/jdbc/rqiang";
    private Connection conn = null;
    private PreparedStatement pstm = null;
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html");
        String userid = req.getParameter("userid");
        ResultSet rs = null;
        PrintWriter out = resp.getWriter();
        try{
            Context ctx = new InitialContext();
            DataSource ds = (DataSource) ctx.lookup(DBNAME);
            conn = ds.getConnection();
            String sql = "SELECT COUNT(userid) FROM user Where userid=?";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, userid);
            rs = pstm.executeQuery();
            if (rs.next()){
                if(rs.getInt(1)>0){
                    out.print("true");
                }else{
                    out.print("false");
                }
            }
            out.close();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                conn.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
