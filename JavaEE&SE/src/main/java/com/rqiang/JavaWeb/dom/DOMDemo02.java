package com.rqiang.JavaWeb.dom;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class DOMDemo02 {
    public static void main(String[] args) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.newDocument();
        Element addresslist = doc.createElement("addresslist");
        Element linkman = doc.createElement("linkman");
        Element name = doc.createElement("name");
        Element email = doc.createElement("email");
        name.appendChild(doc.createTextNode("man"));
        email.appendChild(doc.createTextNode("man@123.com"));
        linkman.appendChild(name);
        linkman.appendChild(email);
        addresslist.appendChild(linkman);
        doc.appendChild(addresslist);

        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
        DOMSource source = new DOMSource(doc);
        StreamResult streamResult = new StreamResult(new File("E:\\untitled\\src\\main\\resources\\xml_demo05_DomSource.xml"));
        transformer.transform(source, streamResult);

    }
}
