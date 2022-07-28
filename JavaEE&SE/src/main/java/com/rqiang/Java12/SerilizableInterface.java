package com.rqiang.Java12;

import java.io.*;

class Person3 implements Serializable{
    String name;
    int age;

    public Person3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person3{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class SerilizableInterface {
    public static void main2(String[] args) throws Exception {
        Person3 per = new Person3("邹！！", 25);
        File f = new File("E:" + File.separator + "JavaFile"+ File.separator + "obj.txt");
        ObjectOutputStream out = null;
        OutputStream output = new FileOutputStream(f);
        out = new ObjectOutputStream(output);
        out.writeObject(per);
        out.close();
    }

    public static void main(String[] args) throws Exception {
        File f = new File("E:" + File.separator + "JavaFile"+ File.separator + "obj.txt");
        ObjectInputStream inp = null;
        InputStream input = new FileInputStream(f);
        inp = new ObjectInputStream(input);
        Object b = inp.readObject();
        System.out.println(b.toString());
        inp.close();
    }


}
