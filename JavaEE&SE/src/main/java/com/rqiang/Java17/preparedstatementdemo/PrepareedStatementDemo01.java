package com.rqiang.Java17.preparedstatementdemo;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PrepareedStatementDemo01 {
    public static final String DBDRIVER = "org.gjt.mm.mysql.Driver";
    public static final String DBURL = "jdbc:mysql://localhost:3306/db_book";
    public static final String DBUSER = "root";
    public static final String DBPWD = "123456";

    public static void main(String[] args) throws Exception {
        Connection conn = null;
        PreparedStatement prestat = null;
        String name = "Zrqiang";
        String password = "111111";
        int age = 18;
        String sex = "男";
        String birthday = "2020-06-30";
        Date temp = new SimpleDateFormat("yyyy-MM-dd").parse(birthday);
        java.sql.Date bir = new java.sql.Date(temp.getTime());
        String sql = "INSERT INTO user(name, password, age, sex, birthday)" +
                " VALUES(?, ?, ?, ?, ?)";
        System.out.println(sql);
        Class.forName(DBDRIVER);
        conn = DriverManager.getConnection(DBURL, DBUSER, DBPWD);
        prestat = conn.prepareStatement(sql);
        prestat.setString(1, name);
        prestat.setString(2, password);
        prestat.setString(4, sex);
        prestat.setInt(3, age);
        prestat.setDate(5, bir);
        prestat.executeUpdate();
        prestat.close();
        conn.close();
    }

    @Test
    public void test() throws ParseException {
        String birthday = "2020-06-30";
        Date temp = new SimpleDateFormat("yyyy-MM-dd").parse(birthday);
        java.sql.Date bir = new java.sql.Date(temp.getTime());
        System.out.println(temp);
        System.out.println(bir);
    }
}
