package com.rqiang.DAO.test;

import com.rqiang.DAO.dao.EmpDAOProxy;
import com.rqiang.DAO.dao.IEmpDAO;
import com.rqiang.DAO.dao.impl.EmpDAOImpl;
import com.rqiang.DAO.dbc.DatabaseConnection;
import com.rqiang.DAO.vo.Emp;
import org.junit.Test;

import java.sql.Connection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class test {
    @Test
    public void test2() throws Exception {
        Connection conn = new DatabaseConnection().getConnection();
        IEmpDAO iEmpDAO = new EmpDAOProxy();
        for(int i = 0; i<1; i++){
            Emp e = new Emp();
            e.setSal(11.2f);
            e.setempno(6+i+1);
            e.setHiredate(new Date());
            e.setEname("rqiang");
            e.setJob("kaifa");
            iEmpDAO.doCreate(e);
        }
        conn.close();
    }

    @Test
    public void test1() throws Exception {
        Connection conn = new DatabaseConnection().getConnection();
        IEmpDAO iEmpDAO = new EmpDAOImpl(conn);
        List<Emp> emps = iEmpDAO.findAll("rqiang");
        Iterator<Emp> iter = emps.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        conn.close();
    }
}
