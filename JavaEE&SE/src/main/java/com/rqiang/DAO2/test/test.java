package com.rqiang.DAO2.test;

import com.rqiang.DAO2.dao.IUserDAO;
import com.rqiang.DAO2.factory.DAOFactory;

public class test {
    public static void main(String[] args) {
        IUserDAO f = DAOFactory.getUserDAOInstance();

    }
}
