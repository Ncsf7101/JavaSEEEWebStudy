package com.rqiang.JavaWeb.JSPEmp;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Empdao {
    public static final String DBDRIVER = "org.gjt.mm.mysql.Driver";
    public static final String DBURL = "jdbc:mysql://localhost:3306/db_javaweb";
    public static final String DBUSER = "root";
    public static final String DBPWD = "123456";
    @Test
    public static List<Empvo> getEmpAll() throws Exception{
        Class.forName(DBDRIVER);
        Connection conn = DriverManager.getConnection(DBURL, DBUSER, DBPWD);
        String sql = "SELECT * FROM emp";
        PreparedStatement pstat = conn.prepareStatement(sql);
        ResultSet set = pstat.executeQuery();
        List<Empvo> emps = new ArrayList<Empvo>();
        while(set.next()){
            Empvo emp = new Empvo();
            emp.setEmpno(set.getInt(1));
            emp.setEname(set.getString(2));
            emp.setJob(set.getString(3));
            emp.setHiredate(new Date(set.getDate(4).getTime()));
            emp.setSal(set.getFloat(5));
            emps.add(emp);
        }
        pstat.close();
        conn.close();
        return emps;
    }

    public static void main1(String[] args) throws Exception {
        List<Empvo> emps = null;
        try {
            emps = getEmpAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(emps.get(0).toString());
    }


    public static void main2(String[] args) throws Exception {
        List<Empvo> demo = getEmpAll();
        Document doc = DocumentHelper.createDocument();
        Element dept = doc.addElement("dept");
        Element emp = dept.addElement("emp");
        Element empno = emp.addElement("empno");
        Element ename = emp.addElement("ename");
        Element job = emp.addElement("job");
        Element hiredate = emp.addElement("hiredate");
        Element sal = emp.addElement("sal");
        Iterator<Empvo> d = demo.iterator();
        while(d.hasNext()){
            Empvo e = d.next();
            empno.setText(String.valueOf(e.empno));
            ename.setText(e.ename);
            job.setText(e.job);
            hiredate.setText(String.valueOf(e.hiredate));
            sal.setText(String.valueOf(e.sal));
        }

        OutputFormat format = OutputFormat. createPrettyPrint();
        format.setEncoding("UTF-8");
        XMLWriter writer = new XMLWriter(new FileOutputStream(new File("homwork03.xml")));
        writer.write(doc);
        writer.close();

    }

    public static void main(String[] args) throws Exception {
        SAXReader reader = new SAXReader();
        File f = new File("homwork03.xml");
        Document doc = reader.read(f);
        Element root = doc.getRootElement();
        Iterator<Element> iter = root.elementIterator();

        Class.forName(DBDRIVER);
        Connection conn = DriverManager.getConnection(DBURL, DBUSER, DBPWD);
        String sql = "INSERT INTO emp values(?,?,?,?,?)";
        PreparedStatement pstat = conn.prepareStatement(sql);
        while(iter.hasNext()){
            Element emp = iter.next();
            pstat.setInt(1, Integer.parseInt(emp.elementText("empno")));

            pstat.setString(2, emp.elementText("ename"));

            pstat.setString(3, emp.elementText("job"));
            java.sql.Date date = new java.sql.Date(new Date(emp.elementText("hiredate")).getTime());
            pstat.setDate(4, date);

            pstat.setFloat(5, Float.parseFloat(emp.elementText("sal")));
            pstat.executeUpdate();
        }
        pstat.close();
        conn.close();
    }


}


