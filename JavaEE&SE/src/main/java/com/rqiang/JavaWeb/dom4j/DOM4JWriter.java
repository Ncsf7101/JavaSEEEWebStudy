package com.rqiang.JavaWeb.dom4j;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class DOM4JWriter {
    public static void main(String[] args) throws Exception {
        Document doc = DocumentHelper.createDocument();
        Element addresslist = doc.addElement("addresslist");

        for(int i = 0; i<2; i++) {
            Element linkman = addresslist.addElement("linkman");
            Element name = linkman.addElement("name");
            Element email = linkman.addElement("email");
            name.setText("玻璃璃");
            email.setText("1126326756@QQ.com");
        }
        OutputFormat format = OutputFormat.createPrettyPrint();
        format.setEncoding("UTF-8");
        XMLWriter writer = new XMLWriter(new FileOutputStream("E:\\untitled\\src\\main\\resources\\do4j_demo.xml"), format);
        writer.write(doc);
        writer.close();
    }
}
