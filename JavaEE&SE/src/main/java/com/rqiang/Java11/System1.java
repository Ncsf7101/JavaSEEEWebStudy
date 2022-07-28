package com.rqiang.Java11;

class Person{
    public void finalize() throws Throwable{
        System.out.println("被释放了");
    }
}

public class System1 {
    public static void main(String[] args) {
    Person per = new Person();
    per = null;
    System.gc();

        //System.getProperties().list(System.out);
    }
}
