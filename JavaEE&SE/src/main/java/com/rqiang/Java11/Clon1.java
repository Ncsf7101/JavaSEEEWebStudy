package com.rqiang.Java11;

class Per implements Cloneable {
    String name = "Hello";
    String name2 = "World";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    @Override
    public String toString() {
        return "Per{" +
                "name='" + name + '\'' +
                ", name2='" + name2 + '\'' +
                '}';
    }

    public Object clone(){ //throws CloneNotSupportedException {
        Object clo = null;
        try{
            clo = super.clone();
        }catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clo;
    }
}

public class Clon1 {



    public static void main(String[] args) {
        Per per1 = new Per();
        Per per2 = (Per) per1.clone();
        per2.setName2("ooooo");
        System.out.println(per2.toString());
    }

}
