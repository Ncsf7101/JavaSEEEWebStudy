package com.rqiang.Java13;

import org.junit.Test;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Properties1 {

    @Test
    public void store1() throws IOException {
        File f = new File("E:" + File.separator + "JavaFile" + File.separator + "store.properties");
        Properties pro = new Properties();
        pro.setProperty("a", "1");
        pro.setProperty("d", "4");
        pro.setProperty("c", "3");
        pro.setProperty("b", "2");
        OutputStream out = new FileOutputStream(f);
        pro.store(out, "瞎写");
        out.close();
    }

    @Test
    public void load1() throws IOException {
        File f = new File("E:" + File.separator + "JavaFile" + File.separator + "store.properties");
        Properties pro = new Properties();
        InputStream inputStream = new FileInputStream(f);
        pro.load(inputStream);
        Set<Object> set= pro.keySet();
        Iterator<Object> iter = set.iterator();
        while(iter.hasNext()) {
            String str = (String) iter.next();
            System.out.println(str + "---" + pro.getProperty(str));
        }
    }

   @Test
    public void test2Reflect(){
        Class<?> c1 = null;
       try {
           c1 = Class.forName("com.rqiang.Java12.InputData1");
       } catch (ClassNotFoundException e) {
           e.printStackTrace();
       }
       {
           Field f[] = c1.getDeclaredFields();
           for(int i = 0; i<f.length; i++){
               Class<?> f1 = f[i].getType();
               int j = f[i].getModifiers();
               System.out.print(Modifier.toString(j));
               System.out.println(" " + f1.getName());
           }
       }
   }
}
