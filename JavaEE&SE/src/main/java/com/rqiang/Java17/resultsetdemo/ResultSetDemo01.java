package com.rqiang.Java17.resultsetdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

public class ResultSetDemo01 {
    public static final String DBDRIVER = "org.gjt.mm.mysql.Driver";
    public static final String DBURL = "jdbc:mysql://localhost:3306/db_book";
    public static final String DBUSER = "root";
    public static final String DBPWD = "123456";

    public static void main(String[] args) throws Exception {
        Connection conn = null;
        Statement stat = null;
        ResultSet rset = null;
        String sql = "SELECT id, name, password, age, sex, birthday FROM user";
        System.out.println(sql);


        Class.forName(DBDRIVER);
        conn = DriverManager.getConnection(DBURL, DBUSER, DBPWD);
        stat = conn.createStatement();
        rset = stat.executeQuery(sql);
        System.out.println("编号"+ "\t"+"姓名\t密码\t年龄\t性别\t生日");
        while (rset.next()){
            int id = rset.getInt("id");
            String name = rset.getString("name");
            String password = rset.getString("password");
            int age = rset.getInt("age");
            String sex = rset.getString(5);
            Date birthday = rset.getDate(6);

            System.out.println(id + "\t" + name + "\t" + password +
                    "\t" + age + "\t" + sex + "\t" + birthday);
        }
        rset.close();
        stat.close();
        conn.close();
    }
}
