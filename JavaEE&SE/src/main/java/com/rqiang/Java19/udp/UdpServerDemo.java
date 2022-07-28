package com.rqiang.Java19.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class UdpServerDemo {
    public static void main(String[] args) throws Exception {

        DatagramSocket ds = new DatagramSocket(3000);
        String str = "你好呀~";
        String strE = URLEncoder.encode(str, "UTF-8");
        DatagramPacket dp = new DatagramPacket(strE.getBytes(), strE.length()
                , InetAddress.getByName("localhost"), 9000);
        System.out.println("发送信息~");
        ds.send(dp);
        ds.close();
    }

}
