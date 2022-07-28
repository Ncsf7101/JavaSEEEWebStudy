package com.rqiang.JavaWeb.homework03;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.junit.Test;

import javax.print.Doc;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
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
        String sql = "SELECT * FROM dept";
        PreparedStatement pstat = conn.prepareStatement(sql);
        ResultSet set = pstat.executeQuery();
        List<Empvo> emps = new ArrayList<Empvo>();
        while(set.next()){
            Empvo emp = new Empvo();
            emp.setDeptno(set.getInt(1));
            emp.setDname(set.getString(2));
            emp.setLoc(set.getString(3));
            emps.add(emp);
        }
        pstat.close();
        conn.close();
        return emps;
    }

    public static void main1(String[] args) throws Exception {
        List<Empvo> demo = getEmpAll();
        Document doc = DocumentHelper.createDocument();
        Element dept = doc.addElement("dept");
        Element emp = dept.addElement("emp");
        Element deptno = emp.addElement("deptno");
        Element dname = emp.addElement("dname");
        Element loc = emp.addElement("loc");
        Iterator<Empvo> d = demo.iterator();
        while(d.hasNext()){
            Empvo e = d.next();
            deptno.setText(String.valueOf(e.deptno));
            dname.setText(e.dname);
            loc.setText(e.loc);
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
        Iterator iter = root.elementIterator();
        while(iter.hasNext()){
            Element emp = (Element) iter.next();
            System.out.println(emp.elementText("deptno"));
            System.out.println(emp.elementText("dname"));
            System.out.println(emp.elementText("loc"));
        }
    }
}
