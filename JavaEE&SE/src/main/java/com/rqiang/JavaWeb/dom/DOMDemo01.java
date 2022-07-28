package com.rqiang.JavaWeb.dom;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class DOMDemo01 {
    public static void main(String[] args) throws Exception{
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        File f = new File("D:\\JAVA_lp\\实战项目集合\\springmvcAndVu\\XML\\xml_demo05.xml");
        Document doc = builder.parse("E:\\untitled\\src\\main\\resources\\xml_demo05.xml");
        NodeList nl = doc.getElementsByTagName("linkman");
        System.out.println(doc.getElementsByTagName("name").item(0).getNodeName() +
                "______" + doc.getElementsByTagName("name").item(0).getFirstChild().getNodeValue() );
        for(int i = 0; i<nl.getLength(); i++){
            if(nl.item(i).hasChildNodes())
            {
                NodeList nl2 = nl.item(i).getChildNodes();
                for(int j = 0; j< nl2.getLength(); j++){
                    if(nl2.item(j).getFirstChild() != null)
                        System.out.println(nl2.item(j).getNodeName() + "---" + nl2.item(j).getFirstChild().getNodeValue());
                }

            }
                //System.out.println(nl.item(i).getNodeName());
        }
    }
}
