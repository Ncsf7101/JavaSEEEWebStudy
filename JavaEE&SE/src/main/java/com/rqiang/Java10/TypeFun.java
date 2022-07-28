package com.rqiang.Java10;

class Info1<T extends String>{
    private T var;

    public T getVar() {
        return var;
    }

    public void setVar(T var) {
        this.var = var;
    }

    @Override
    public String toString() {
        return "Info{" +
                "var=" + var +
                '}';
    }
}


public class TypeFun {
    public static void main(String[] args) {
        Integer i[] = fun1(1,2,3,4,5,6);
        fun2(i);
    }

    public static <T> T[] fun1(T...arg){
        return arg;
    }

    public static <T> void fun2(T param[]){
        System.out.print("接收泛型数组: ");
        for(T t:param){
            System.out.print(t + "、");
        }
        System.out.println();
    }
}
