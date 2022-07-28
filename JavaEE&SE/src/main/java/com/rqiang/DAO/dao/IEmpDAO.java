package com.rqiang.DAO.dao;

import com.rqiang.DAO.vo.Emp;

import java.util.List;

public interface IEmpDAO {

    /**
     * 数据查询的增加操作
     * @param emp 需要增加的数据对象
     * @return 是否增加成员成功的标记
     * @throws Exception 有异常交给被调用处处理
     */
    public boolean doCreate(Emp emp) throws Exception;

    /**
     * 查询全部的数据, 一般以findXxx的方式命名
     * @param keyWord 查询关键字
     * @return 返回全部的查询结果，每一个Emp对象表示表的一行记录
     * @throws Exception 有异常交给被调用处处理
     */
    public List<Emp> findAll(String keyWord) throws Exception;

    /**
     * 根据雇员编号查询雇员信息
     * @param empno 雇员编号
     * @return 雇员的vo对象
     * @throws Exception 有异常交给被调用处处理
     */
    public Emp findById(int empno) throws Exception;

}
