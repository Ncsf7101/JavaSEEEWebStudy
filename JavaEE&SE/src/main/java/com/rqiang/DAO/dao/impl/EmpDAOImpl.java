package com.rqiang.DAO.dao.impl;

import com.rqiang.DAO.dao.IEmpDAO;
import com.rqiang.DAO.vo.Emp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmpDAOImpl implements IEmpDAO {
    Connection conn = null;
    PreparedStatement pstmt = null;
    public EmpDAOImpl(Connection conn){
        this.conn = conn;
    }

    @Override
    public boolean doCreate(Emp emp) throws Exception{
        boolean flag = false;
        String sql = "INSERT INTO emp(empno, ename, job, " +
                "hiredate, sal) values(?,?,?,?,?)";
        this.pstmt = this.conn.prepareStatement(sql);
        this.pstmt.setInt(1, emp.getempno());
        this.pstmt.setString(2, emp.getEname());
        this.pstmt.setString(3, emp.getJob());
        this.pstmt.setDate(4, new java.sql.Date(emp.getHiredate().getTime()));
        this.pstmt.setFloat(5, emp.getSal());
        if(this.pstmt.executeUpdate() > 0){
            flag = true;
        }
        this.pstmt.close();
        return flag;
    }

    @Override
    public List<Emp> findAll(String keyWord) throws Exception {
        List<Emp> emps = new ArrayList<Emp>();
        String sql = "SELECT empno, ename, job, " +
                "hiredate, sal FROM emp WHERE empno LIKE ? OR ename LIKE ?";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, "%" + keyWord + "%");
        pstmt.setString(2, "%" + keyWord + "%");
        ResultSet rset = pstmt.executeQuery();
        while(rset.next()){
            Emp emp = new Emp();
            emp.setempno(rset.getInt(1));
            emp.setEname(rset.getString(2));
            emp.setJob(rset.getString(3));
            emp.setHiredate(rset.getDate(4));
            emp.setSal(rset.getFloat(5));
            emps.add(emp);
        }
        return emps;
    }

    @Override
    public Emp findById(int empno) throws Exception {
        Emp emp = null;
        String sql = "SELECT empno, ename, job, " +
                "hiredate, sal FROM emp WHERE empno=?";
        pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, empno);
        ResultSet rset = pstmt.executeQuery();
        while(rset.next()){
            emp = new Emp();
            emp.setempno(rset.getInt(1));
            emp.setEname(rset.getString(2));
            emp.setJob(rset.getString(3));
            emp.setHiredate(rset.getDate(4));
            emp.setSal(rset.getFloat(5));
        }
        return emp;
    }


}
