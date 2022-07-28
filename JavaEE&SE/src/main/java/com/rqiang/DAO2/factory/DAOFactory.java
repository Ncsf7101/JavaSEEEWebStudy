package com.rqiang.DAO2.factory;

import com.rqiang.DAO2.dao.IUserDAO;
import com.rqiang.DAO2.dao.impl.UserDAOImpl;
import com.rqiang.DAO2.dao.proxy.UserDAOProxy;

public class DAOFactory {
    public static IUserDAO getUserDAOInstance() {
        return new UserDAOProxy();
    }
}
