package com.rqiang.Java19.urlcoding;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class URLEncoderAndURLDecoder {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "Hello 邹荣强";
        String strEn = URLEncoder.encode(str, "UTF-8");
        String strDe = URLDecoder.decode(strEn, "UTF-8");
        System.out.println(str);
        System.out.println(strEn);
        System.out.println(strDe);
    }
}
