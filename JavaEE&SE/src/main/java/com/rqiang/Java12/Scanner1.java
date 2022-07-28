package com.rqiang.Java12;

import org.junit.Test;

import java.io.*;
import java.util.Scanner;

public class Scanner1 {
    public static void main1(String[] args) {
        File file = new File("E:" + File.separator + "JavaFile" + File.separator + "Hello World.txt");
        Scanner scanner = null;
        try{
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        scanner.useDelimiter("\\n");
        StringBuffer strbuf = new StringBuffer();
        while(scanner.hasNext()){
            strbuf.append(scanner.next());
        }
        System.out.println(strbuf);
    }


    public static void main(String[] args) throws IOException {
        DataInputStream dis = null;
        File f = new File("E:"+ File.separator +"JavaFile" + File.separator + "Hello1.txt");
        dis = new DataInputStream(new FileInputStream(f));
        String name = null;
        float price = 0.0f;
        int num = 0;
        char temp[] = null;
        char c = 0;
        int len = 0;
        try{
            while(true){
                temp = new char[200];
                len = 0;
                while((c=dis.readChar())!='\t'){
                    temp[len] = c;
                    len++;
                }
                name = new String(temp, 0, len);
                price = dis.readFloat();
                dis.readChar();
                num = dis.readInt();
                dis.readChar();
                System.out.printf("%s\t%5.2f\t%d\n", name, price, num);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        dis.close();
    }

    public static void main6(String[] args) throws Exception {
        DataOutputStream dos = null;
        File f = new File("E:"+ File.separator +"JavaFile" + File.separator + "Hello1.txt");
        dos = new DataOutputStream(new FileOutputStream(f));

        String goods[] = {"牙膏", "水杯", "镜子"};
        double prices[] = {8.5F, 10.0F, 7.0F};
        int nums[] = {10, 20, 30};
        for(int i = 0; i< goods.length; i++){
                dos.writeChars("你号");
                dos.writeChar('\t');
                dos.writeDouble(10.1f);
                dos.writeChar('\t');
                dos.writeInt(2);
                dos.writeChar('\n');
        }
        dos.close();
    }
}
