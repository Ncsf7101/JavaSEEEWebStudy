package com.rqiang.Java19.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.URLDecoder;

public class UdpClientDemo {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(9000);
        byte[] b = new byte[1024];
        DatagramPacket dp = new DatagramPacket(b, b.length);
        System.out.println("服务器正在运行，准备接收...");
        ds.receive(dp);
        b = dp.getData();

        System.out.println(URLDecoder.decode(new String(b
                , 0, dp.getLength()), "UTF-8"));
        ds.close();
    }
}
