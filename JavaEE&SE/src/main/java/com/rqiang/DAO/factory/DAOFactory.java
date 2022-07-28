package com.rqiang.DAO.factory;

import com.rqiang.DAO.dao.EmpDAOProxy;
import com.rqiang.DAO.dao.IEmpDAO;

public class DAOFactory {
    public static IEmpDAO getIEmpDAOInstance() throws Exception{
        return new EmpDAOProxy();
    }
}
