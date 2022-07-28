package com.rqiang.Java12;

import java.io.File;
import java.util.Scanner;

public class File1 {
    public static void mainCreateFile(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        File file = new File("E:"+ File.separator +"JavaFile"+ File.separator  +name + ".txt");
        try{
            file.createNewFile();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void mainDeleteFile(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        File file = new File("E:"+ File.separator +"JavaFile"+ File.separator  +name + ".txt");
        if(file.exists()){
            file.delete();
        }
    }
    public static void mainMkdir(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        File file = new File("E:"+ File.separator +"JavaFile"+ File.separator  +name);
        if(file.getParentFile().exists()){
            file.mkdir();
            System.out.println("1");
        }
    }

    public static void main(String[] args) {
        File file = new File("E:"+ File.separator);
        File[] files = file.listFiles();
        for (int i = 0; i<files.length; i++) {
            if(files[i].isDirectory()){
                searchdic(files[i].listFiles());
            }else{
                System.out.println(files[i]);
            }
        }
        //searchdic(files);
    }

    public static void searchdic(File[] fs){
        if(fs == null){}
        else {
            for (int i = 0; i < fs.length; i++) {
                if (fs[i].isDirectory()) {
                    if(fs == null){}else{searchdic(fs[i].listFiles());}
                } else {
                    System.out.println(fs[i]);
                }
            }
        }
    }
}
