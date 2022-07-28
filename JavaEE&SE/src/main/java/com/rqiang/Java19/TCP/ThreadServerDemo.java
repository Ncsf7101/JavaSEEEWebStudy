package com.rqiang.Java19.TCP;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ThreadServerDemo {
    public static void main(String[] args) throws Exception {
        ServerSocket server = null;
        Socket client = null;
        server = new ServerSocket(8888);
        boolean flag = true;
        System.out.println("服务器运行中，等待客户端连接...");
        while(flag){
            client = server.accept();
            System.out.println("客户端连接成功");
            new Thread(new ThreadImp(client)).start();
        }
        server.close();
    }
}
