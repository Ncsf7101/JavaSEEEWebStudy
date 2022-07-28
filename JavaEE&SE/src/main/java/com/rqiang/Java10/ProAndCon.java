package com.rqiang.Java10;

class Info{
    boolean flag = true;
    private String name = "李兴华";
    private String content = "Java 讲师";
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getContent(){
        return content;
    }

    public void setContent(String content){
        this.content = content;
    }

    public synchronized void set(String name, String content){
        if(!flag) {
            try{
                super.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        this.setName(name);
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setContent(content);
        flag = false;
        super.notify();
    }

    public synchronized void get(){
        if(flag){
            try{
                super.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        try{
            Thread.sleep(300);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(this.getName() + "-->" + this.getContent());
        flag = true;
        super.notify();
    }
}

class Producer implements Runnable{
    private Info info = null;

    public Producer(Info info){
        this.info = info;
    }
    public void run(){
        boolean flag = false;
        for(int i = 0; i < 50; i++){
            if (flag) {
                this.info.set("李兴华", "JAVA 讲师");
                flag = false;
            } else {
                this.info.set("mldn", "www.mldnjava.cn");
                flag = true;
            }
        }
    }
}

class Consumer implements Runnable{
    private Info info = null;
    public Consumer(Info info){
        this.info = info;
    }
    public void run(){
        for (int i = 0; i < 50; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.info.get();
        }
    }
}


public class ProAndCon {
    public static void main(String[] args){
        Info i = new Info ();
        Producer pro = new Producer(i);
        Consumer con = new Consumer(i);
        new Thread(pro).start();
        new Thread(con).start();
    }
}
