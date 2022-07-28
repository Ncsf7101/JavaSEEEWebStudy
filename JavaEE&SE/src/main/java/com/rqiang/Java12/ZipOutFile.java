package com.rqiang.Java12;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

public class ZipOutFile {
    public static void main2(String[] args) throws IOException {
        File file = new File("E:" + File.separator + "JavaFile" + File.separator + "Hello World.txt");
        File zipFile = new File("E:" + File.separator + "JavaFile" + File.separator + "Hello World.zip");
        InputStream input = new FileInputStream(file);
        ZipOutputStream zipOutFile = new ZipOutputStream(new FileOutputStream(zipFile));
        zipOutFile.putNextEntry(new ZipEntry(file.getName()));
        zipOutFile.setComment("Hello HELLO");
        int temp = 0;
        while((temp=input.read())!=-1){
            zipOutFile.write(temp);
        }
        input.close();
        zipOutFile.close();
    }

    public static void main(String[] args) throws IOException {
        File file = new File("E:" + File.separator + "JavaFile" + File.separator + "Hello World.zip");
        File output = new File("E:" + File.separator + "JavaFile" + File.separator + "Hello World_out.txt");
        ZipFile zipFile = new ZipFile(file);
        ZipEntry zipEntry = zipFile.getEntry("Hello World.txt");
        InputStream input = zipFile.getInputStream(zipEntry);
        OutputStream out = new FileOutputStream(output);
        int temp = 0;
        while((temp = input.read())!= -1 ){
            out.write(temp);
        }
        input.close();
        out.close();
    }
}
