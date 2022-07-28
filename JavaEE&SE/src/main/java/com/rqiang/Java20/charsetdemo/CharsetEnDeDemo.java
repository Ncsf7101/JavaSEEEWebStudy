package com.rqiang.Java20.charsetdemo;

import org.junit.Test;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;

public class CharsetEnDeDemo {
    public static void main(String[] args) throws Exception {
        Charset charset = Charset.forName("UTF-8");
        CharsetDecoder dc = charset.newDecoder();
        CharsetEncoder ec = charset.newEncoder();
        CharBuffer cb = CharBuffer.wrap("你好啊");
        ByteBuffer buf = ec.encode(cb);
        CharBuffer cbd = dc.decode(buf);
        System.out.println("编码后: " + buf);
        System.out.println("解码后: " + cbd);
    }

    @Test
    public void test(){
        SortedMap<String, Charset> all = null;
        all = Charset.availableCharsets();
        Iterator<Map.Entry<String, Charset>> iter = null;
        iter = all.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry<String, Charset> it = iter.next();
            System.out.println(it.getKey() + "|||" + it.getValue());
        }
    }
}
