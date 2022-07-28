package com.rqiang.Java20.channel;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelDemo02 {
    public static void main(String[] args) throws Exception {
        File file1 = new File("E:" + File.separator + "JavaFile"
                + File.separator + "channel.txt");
        File file2 = new File("E:" + File.separator + "JavaFile"
                + File.separator + "channel2.txt");
        FileInputStream inp = new FileInputStream(file1);
        FileOutputStream out = new FileOutputStream(file2);
        FileChannel Cinp = inp.getChannel();
        FileChannel Cout = out.getChannel();
        ByteBuffer b = ByteBuffer.allocate(1024);
        int temp = 0;
        while((temp = Cinp.read(b)) != -1){
            b.flip();
            Cout.write(b);
            b.clear();
        }
        out.close();
        inp.close();
    }

}
