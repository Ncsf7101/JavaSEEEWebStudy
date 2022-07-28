package com.rqiang.Java19.TCP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientSocketDemo01 {
    public static void main(String[] args) throws Exception {
        Socket client = null;
        client = new Socket("localhost", 8888);
        BufferedReader buf = null;
        buf = new BufferedReader(new InputStreamReader(client.getInputStream()));
        String str = buf.readLine();
        System.out.println(str);
        buf.close();
        client.close();
    }
}
