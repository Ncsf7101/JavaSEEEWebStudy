package com.rqiang.JavaWeb.dom4j;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.util.Iterator;

public class DOM4JReader {
    public static void main(String[] args) throws Exception {
        File f = new File("E:\\untitled\\src\\main\\resources\\do4j_demo.xml");
        SAXReader reader = new SAXReader();
        Document doc = reader.read(f);
        Element root = doc.getRootElement();
        Iterator iter = root.elementIterator();
        while(iter.hasNext()){
            Element linkman = (Element) iter.next();
            System.out.println("姓名: " + linkman.elementText("name"));
            System.out.println("邮箱: " + linkman.elementText("email"));
        }
    }
}
