package com.rqiang.DAO2.dao.proxy;

import com.rqiang.DAO2.dbc.DatabaseConnection;
import com.rqiang.DAO2.dao.IUserDAO;
import com.rqiang.DAO2.dao.impl.UserDAOImpl;
import com.rqiang.DAO2.vo.User;

public class UserDAOProxy implements IUserDAO {
    private DatabaseConnection conn = null;
    private IUserDAO dao = null;
    public UserDAOProxy(){
        try{
            this.conn = new DatabaseConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.dao = new UserDAOImpl(this.conn.getConnection());
    }

    @Override
    public boolean findLogin(User user) throws Exception {
        boolean flag = false;
        try{
            flag = this.dao.findLogin(user);
        }catch (Exception e){
            throw e;
        }finally {
            this.conn.close();
        }
        return flag;
    }
}
