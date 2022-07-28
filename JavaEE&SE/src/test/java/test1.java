import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Date;

public class test1 {
    public static void main(String[] args) throws IOException {
        System.out.println(System.getProperty("file.encoding"));

        //File f = new File("E:" + File.separator + "JavaFile" + File.separator + "encoding1.txt");
        File f = new File("E:" + File.separator + "JavaFile"
                + File.separator + "channel2.txt");
        OutputStream out = new FileOutputStream(f);
        byte by[] = "你好啊！".getBytes("ISO8859-1");
        out.write(by);
        out.close();
    }

    @Test
    public void test(){
        String d = new String("Sun Jul 03 00:00:00 CST 2022");
        java.sql.Date d1 = new java.sql.Date(new Date(d).getTime());
        System.out.println(d1);
    }

    @Test
    public void test2(){

    }
}
