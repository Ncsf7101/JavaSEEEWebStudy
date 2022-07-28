package com.rqiang.DAO2.dao.impl;

import com.rqiang.DAO2.dao.IUserDAO;
import com.rqiang.DAO2.vo.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAOImpl implements IUserDAO {
    private Connection conn = null;
    private PreparedStatement pstmt = null;

    public UserDAOImpl(Connection conn) {
        this.conn = conn;
    }

    @Override
    public boolean findLogin(User user) throws Exception {
        boolean flag = false;
        try{
            String sql = "SELECT name FROM user WHERE userid=? AND password=?";
            this.pstmt = this.conn.prepareStatement(sql);
            this.pstmt.setString(1, user.getUserid());
            this.pstmt.setString(2, user.getPassword());
            ResultSet rset = this.pstmt.executeQuery();
            if(rset.next()){
                user.setName(rset.getString(1));
                flag = true;
            }
        }catch (Exception e){
            throw e;
        }finally {
            if(this.pstmt != null){
                try{
                    this.pstmt.close();
                }catch (Exception e){
                    throw e;
                }
            }
        }
        return flag;
    }
}
