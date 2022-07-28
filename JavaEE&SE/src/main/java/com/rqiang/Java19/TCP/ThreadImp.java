package com.rqiang.Java19.TCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class ThreadImp implements Runnable {
    private Socket client = null;

    ThreadImp (Socket client){
        this.client = client;
    }
    public void run() {
        BufferedReader inp = null;
        PrintStream out = null;
        try {
            boolean flag = true;
            inp = new BufferedReader(new InputStreamReader(client.getInputStream()));
            out = new PrintStream(client.getOutputStream());
            while(flag){
                String str = inp.readLine();
                if ("bye".equals(str) || "".equals(str) || str == null){
                    flag = false;
                }else{
                    out.println("ECHO: " + str);
                }
            }
            out.close();
            client.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
