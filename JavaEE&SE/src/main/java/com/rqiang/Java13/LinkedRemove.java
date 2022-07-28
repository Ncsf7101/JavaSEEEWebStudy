package com.rqiang.Java13;

import org.junit.Test;

import java.util.*;


public class LinkedRemove {
    @Test
    public void remove(){
        LinkedList<String> str = new LinkedList<String>();
        str.add("c");
        str.add("b");
        str.add("a");
        String a = str.remove();
        System.out.println(a);
        System.out.println(str);
    }

    @Test
    public void setTree(){
        Set<String> set = new TreeSet<String>();
        set.add("c");
        set.add("b");
        set.add("a");
        String set1[] = set.toArray(new String[]{});
        for(int i = 0; i<set.size(); i++){
            System.out.println(set1[i]);
        }
    }

    @Test
    public void getValues(){
        Map<String, String> map = null;
        map = new HashMap<String, String>();
        map.put("z", "1");
        map.put("z1", "1");
        map.put("z2", "1");
        map.put("z3", "1");
        map.put("z4", "1");
        Collection<String> values = map.values();
        Iterator<String> iterator = values.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+"、");
        }
    }
    class Per{
        String name;
        int age;
        Per(String name, int age){
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Per{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
    @Test
    public void ValuesFind(){
        Map<Per, String> map = new HashMap<Per, String>();
        map.put(new Per("梨花", 10), "Lihua");
        Iterator<Map.Entry<Per, String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Per, String> me = iterator.next();
            System.out.println(me.getKey() + "  " + me.getValue());
        }
    }

    @Test
    public void Stack1(){
        Stack<String> s = new Stack<String>();
        s.push("a");
        s.push("b");
        s.push("c");
        s.push("d");
        s.push("g");
        while(!s.empty()){
            System.out.println(s.pop());
        }
    }
}
