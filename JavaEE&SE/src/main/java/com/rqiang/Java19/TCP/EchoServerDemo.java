package com.rqiang.Java19.TCP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServerDemo {
    public static void main(String[] args) throws Exception {
        ServerSocket server = null;
        Socket client = null;
        PrintStream out = null;
        BufferedReader inp = null;
        boolean flag = true;
        server = new ServerSocket(8888);
        while (flag){
            System.out.println("服务器运行，等待客户端连接...");
            client = server.accept(); //等待客户端
            inp = new BufferedReader(new InputStreamReader(client.getInputStream()));
            out = new PrintStream(client.getOutputStream());
            boolean f = true;
            while(f){
                String str = inp.readLine();
                if (str == null || "".equals(str)){
                    flag = false;
                }else {
                    out.println(str);
                }
            }
            out.close();
            client.close();
        }

        //client = server.accept();

        server.close();
    }
}
