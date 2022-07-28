package com.rqiang.Java19.url;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class UrlDemo01 {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http", "www.baidu.com"
                , 80, "/index.html");
        //URLConnection urlC = url.openConnection();
        InputStream inp = url.openStream();
        Scanner scan = new Scanner(inp);
        scan.useDelimiter("\n");
        while(scan.hasNext()){
            System.out.println(scan.next());
        }
    }
}
