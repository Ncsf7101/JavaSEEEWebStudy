package com.rqiang.DAO.dao;

import com.rqiang.DAO.dao.impl.EmpDAOImpl;
import com.rqiang.DAO.dbc.DatabaseConnection;
import com.rqiang.DAO.vo.Emp;

import java.util.ArrayList;
import java.util.List;

public class EmpDAOProxy implements IEmpDAO{
    private DatabaseConnection dbc = null;
    private IEmpDAO dao = null;
    public EmpDAOProxy() throws Exception{
        this.dbc = new DatabaseConnection();
        this.dao = new EmpDAOImpl(this.dbc.getConnection());
    }

    @Override
    public boolean doCreate(Emp emp) throws Exception {
        boolean flag = false;
        try{
            if(this.dao.findById(emp.getempno()) == null){
                flag = this.dao.doCreate(emp);
            }
        }catch (Exception e){
            throw e;
        }finally {
            this.dbc.close();
        }
        return flag;
    }

    @Override
    public List<Emp> findAll(String keyWord) throws Exception {
        List<Emp> emps = new ArrayList<Emp>();
        try{
            emps = this.dao.findAll(keyWord);
        }catch (Exception e){
            throw e;
        }finally {
            dbc.close();
        }
        return emps;
    }

    @Override
    public Emp findById(int empno) throws Exception {
        Emp emp = new Emp();
        try{
            emp = this.dao.findById(empno);
        }catch (Exception e){
            throw e;
        }finally {
            this.dbc.close();
        }
        return emp;
    }
}
