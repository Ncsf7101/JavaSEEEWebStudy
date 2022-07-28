package com.rqiang.listenerdemo;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class OnlineUserList implements HttpSessionAttributeListener
        , HttpSessionListener, ServletContextListener {
    private ServletContext app = null;
    public void contextInitialized(ServletContextEvent arg0){
        this.app = arg0.getServletContext();
        this.app.setAttribute("online", new TreeSet());
        System.out.println("监听器初始化");
    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        Set set = (Set) this.app.getAttribute("online");
        System.out.println(event.getValue());
        set.add(event.getValue());
        this.app.setAttribute("online", set);
        System.out.println("在线用户列表增加后更新");
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
        Set set = (Set) this.app.getAttribute("online");
        set.remove(event.getValue());
        this.app.setAttribute("online", set);
        System.out.println("在线用户列表删除后更新");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        Set set = (Set) this.app.getAttribute("online");
        set.remove(se.getSession().getAttribute("userid"));
        this.app.setAttribute("online", set);
        System.out.println("在线用户列表注销后更新");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
        Set set = (Set) this.app.getAttribute("online");
        Iterator iter = set.iterator();
        while(iter.hasNext()){
            System.out.println(set.size() + "" + iter.next());
        }
        System.out.println(event.getValue());

    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
    }
/**
 *     public void attributeReplaced(HttpSessionBindingEvent event) {
 *
 *     }
 *
 *     public void sessionCreated(HttpSessionEvent se) {
 *
 *     }
 *
 *     public void contextDestroyed(ServletContextEvent sce) {
 *
 *     }
 */
}
