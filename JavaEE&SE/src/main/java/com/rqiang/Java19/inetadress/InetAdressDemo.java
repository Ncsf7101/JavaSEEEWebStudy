package com.rqiang.Java19.inetadress;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAdressDemo {
    public static void main(String[] args) throws Exception {
        InetAddress localinet = InetAddress.getLocalHost();
        InetAddress otherinet = InetAddress.getByName("www.baidu.com");
        String ip1 = localinet.getHostAddress();
        String ip2 = otherinet.getHostAddress();

        System.out.println(ip1);
        System.out.println(localinet.isReachable(1000));

        System.out.println(ip2);
        System.out.println(otherinet.isReachable(1000));
    }
}