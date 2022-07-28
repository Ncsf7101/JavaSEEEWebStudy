package com.rqiang.Java20.channel;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelDemo01 {
    public static void main(String[] args) throws Exception {
        String info[] = {"11", "22", "你好", "44", "55"};
        File file = new File("E:" + File.separator + "JavaFile" + File.separator + "channel.txt");
        FileOutputStream out = new FileOutputStream(file);
        FileChannel fchannel = out.getChannel();
        ByteBuffer buf = ByteBuffer.allocate(1024);
        for (int i = 0; i<info.length; i++){
            buf.put(info[i].getBytes());
        }
        buf.flip();
        fchannel.write(buf);
        fchannel.close();
        out.close();
    }
}
