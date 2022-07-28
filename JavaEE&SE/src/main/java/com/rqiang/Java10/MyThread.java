package com.rqiang.Java10;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class ThreadDemo extends Thread{
    private String name;
    public ThreadDemo(String name){
        this.name = name;
    }
    public void run(){
        for(int i = 0; i<10; i++){
            System.out.println(name + "第" + i + "次运行");
        }
    }
}

class ThreadDemo2 extends Thread{
    private String name;
    private int ticket = 5;
    public ThreadDemo2(String name){
        this.name = name;
    }
    public void run(){
        for(int i = 0; i<100; i++){
            if(ticket>0)
            {
                System.out.println("买票：ticket = " + ticket--);
            }
        }
    }
}

class ThreadDemo3 implements Runnable{
    private String name;
    private int ticket = 5;
    public ThreadDemo3(String name){
        this.name = name;
    }
    public void run(){
        for(int i = 0; i<100; i++){
            if(ticket>0)
            {
                System.out.println("买票：ticket = " + ticket--);
            }
        }
    }
}

class ThreadDemo4 implements Callable<String> {

    private String name;
    private int ticket = 10;
    public ThreadDemo4(String name){
        this.name = name;
    }
    public String call(){
        for(int i = 0; i<100; i++){
            if(ticket>0)
            {
                System.out.println(name + "买票：ticket = " + ticket--);
            }
        }
        return name +"票卖完了";
    }
}


public class MyThread {
    public static void main2(String[] args) {
        ThreadDemo2 a = new ThreadDemo2("线程A");
        ThreadDemo2 b = new ThreadDemo2("线程B");
        b.start();
        a.start();

    }

    public static void main1(String[] args) {
        ThreadDemo3 a = new ThreadDemo3("线程A");
        new Thread(a).start();
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadDemo4 a = new ThreadDemo4("线程A");
        FutureTask<String> a1 = new FutureTask<String>(a);
        Thread a2 = new Thread(a1);
        //a2.start();
        for(int i = 0; i<50; i++){
            if(i>10)
            {
                try {
                    a2.start();
                    a2.join();
                }catch (Exception e){}
            }
            System.out.println("main买票：ticket = " + i);
        }
        System.out.println(a2.isAlive());
        System.out.println(a1.get());

    }
}