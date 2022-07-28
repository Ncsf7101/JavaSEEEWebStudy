package com.rqiang.Java20.selectordemo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class SelectorClientScoketChannel {
    public static void main(String[] args) throws Exception {
        int port[] = {8000, 8001, 8002, 8003, 8005, 8006};
        for(int i = 0; i<port.length; i++) {
            Socket client = new Socket("localhost", port[i]);
            BufferedReader buf = new BufferedReader(new InputStreamReader(client.getInputStream()));
            System.out.println(buf.readLine());
            buf.close();
            client.close();
        }
    }
}
