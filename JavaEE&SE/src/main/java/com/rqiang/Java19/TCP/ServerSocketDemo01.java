package com.rqiang.Java19.TCP;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketDemo01 {
    public static void main(String[] args) throws Exception {
        ServerSocket server = null;
        Socket client = null;
        PrintStream out = null;
        server = new ServerSocket(8888);
        System.out.println("服务器运行，等待客户端连接...");
        client = server.accept();
        String str = "欢迎访问第一个服务器。";
        out = new PrintStream(client.getOutputStream());
        out.println(str);
        //client = server.accept();
        out.close();
        client.close();
        server.close();

    }
}
