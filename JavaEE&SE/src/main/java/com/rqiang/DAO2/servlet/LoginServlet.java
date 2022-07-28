package com.rqiang.DAO2.servlet;

import com.rqiang.DAO2.factory.DAOFactory;
import com.rqiang.DAO2.vo.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LoginServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = "login.jsp";
        String userid = req.getParameter("userid");
        String userpwd = req.getParameter("userpwd");
        List<String> info = new ArrayList<String>();
        if(userpwd == null || "".equals(userid)){
            info.add("用户id不能为空");
        }
        if(userpwd == null || "".equals(userpwd)){
            info.add("用户pwd不能为空");
        }
        if(info.size() == 0){
            User user = new User();
            user.setUserid(userid);
            user.setPassword(userpwd);
            try{
                if(DAOFactory.getUserDAOInstance().findLogin(user)){
                    info.add("用户登录成功, 欢迎" + user.getName() + "光临");
                }else{
                    info.add("用户登陆失败，错误的用户名和密码");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        req.setAttribute("info", info);
        req.getRequestDispatcher(path).forward(req, resp);
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
