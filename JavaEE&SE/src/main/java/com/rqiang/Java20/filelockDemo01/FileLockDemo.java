package com.rqiang.Java20.filelockDemo01;

import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public class FileLockDemo {
    public static void main(String[] args) throws Exception {
        File file = new File("E:" + File.separator + "JavaFile"
                + File.separator + "channel2.txt");
        FileOutputStream fout = new FileOutputStream(file, true);
        FileChannel fc = fout.getChannel();
        FileLock flock = fc.tryLock();
        if(flock != null){
            System.out.println(file.getName() + "文件锁定300秒");
            Thread.sleep(300000);
            flock.release();
            System.out.println(file.getName() + "文件解除锁定");
        }
        fout.close();
        fout.close();
    }

    @Test
    public void demo() throws Exception {
        FileOutputStream fileOutputStream = new FileOutputStream("E:" + File.separator + "JavaFile"
                + File.separator + "channel3.txt",false);
//        从第2个字节开始，写2个
        fileOutputStream.write("sdf".getBytes(),1,2);
        fileOutputStream.close();
    }

    @Test //锁定时使用文档会报错
    public void lockWrite() throws Exception{
        System.out.println(System.getProperty("file.encoding"));

        //File f = new File("E:" + File.separator + "JavaFile" + File.separator + "encoding1.txt");
        File f = new File("E:" + File.separator + "JavaFile"
                + File.separator + "channel2.txt");
        OutputStream out = new FileOutputStream(f);
        byte by[] = "你好啊！".getBytes("ISO8859-1");
        out.write(by);
        out.close();
    }
}
