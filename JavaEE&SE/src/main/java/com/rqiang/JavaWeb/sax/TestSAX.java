package com.rqiang.JavaWeb.sax;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class TestSAX {
    public static void main(String[] args) throws Exception {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        parser.parse(new File("E:\\untitled\\src\\main\\resources\\xml_demo05.xml"), new MySAX());
    }
}
