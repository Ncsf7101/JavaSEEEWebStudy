package com.rqiang.Java15;

import org.junit.Test;

import java.io.*;
import java.nio.file.FileSystem;
import java.util.Iterator;
import java.util.Properties;

interface Fruit{
    public void eat();
}
class Apple implements Fruit{
    public void eat(){
        System.out.println("吃苹果");
    }
}
class Orange implements Fruit{
    public void eat(){
        System.out.println("吃橘子");
    }
}

class Factory{
    public static Fruit getInstance(String className) {
        Fruit fruit = null;
        try {
            fruit = (Fruit) Class.forName(className).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fruit;
    }
}

public class FactoryFruit {
    public static void main(String[] args) {
        Properties pro = new Properties();
        File file = new File("E:" + File.separator + "JavaFile" + File.separator + "factoryProperties.properties");
        try{
            pro.load(new FileInputStream(file));
        }catch (Exception e){
            e.printStackTrace();
        }
        Iterator<String> iterator = (Iterator<String>) pro.propertyNames();
        while(iterator.hasNext()){
            Fruit f = Factory.getInstance(pro.getProperty(iterator.next()));
            if(f!=null)
                f.eat();
        }

    }



    @Test
    public void writePro() {
        Properties pro = new Properties();
        pro.setProperty("apple", "com.rqiang.Java15.Orange");
        pro.setProperty("orange", "com.rqiang.Java15.Apple");
        File file = new File("E:" + File.separator + "JavaFile" + File.separator + "factoryProperties.properties");
        try {
            pro.store(new FileOutputStream(file), "apple and orange");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void fX(){

    }
}
