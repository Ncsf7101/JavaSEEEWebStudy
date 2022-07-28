package com.rqiang.Java19.TCP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class ThreadClientDemo {
    public static void main(String[] args) throws Exception {
        Socket client = new Socket("localhost", 8888);
        BufferedReader inp = new BufferedReader(new InputStreamReader(client.getInputStream()));
        PrintStream out = new PrintStream(client.getOutputStream());
        BufferedReader print = new BufferedReader(new InputStreamReader(System.in));
        boolean flag = true;
        while(flag) {
            System.out.println("向服务器发送信息: ");
            out.println(print.readLine());
            String str = inp.readLine();
            System.out.println(str);
        }
        client.close();
        inp.close();
    }
}
