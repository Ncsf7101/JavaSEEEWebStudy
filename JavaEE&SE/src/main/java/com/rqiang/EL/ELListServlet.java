package com.rqiang.EL;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ELListServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Dept> list = new ArrayList<Dept>();
        Dept dept = new Dept();
        dept.setDeptno(1);
        dept.setDname("rqiang");
        dept.setLoc("瑞金");
        list.add(dept);
        Dept dept2 = new Dept();
        dept2.setDeptno(2);
        dept2.setDname("rqiang2");
        dept2.setLoc("瑞金2");
        list.add(dept2);
        req.setAttribute("listdept", list);
        req.getRequestDispatcher("dept_list.jsp").forward(req, resp);
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
