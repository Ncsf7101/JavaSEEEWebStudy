package com.rqiang.Java19.TCP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class EchoClientDemo {
    public static void main(String[] args) throws Exception {
        Socket client = null;
        client = new Socket("localhost", 8888);
        BufferedReader accept = new BufferedReader(new InputStreamReader(client.getInputStream()));
        PrintStream out = new PrintStream(client.getOutputStream());
        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        boolean flag = true;
        while(flag){
            System.out.print("输入信息...");
            String str = inp.readLine();
            out.println(str);
            if("再见".equals(str)){
                flag = false;
            }else {
                String echo = accept.readLine();
                System.out.println(echo);
            }
        }
    }
}
