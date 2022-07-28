package com.rqiang.Java12;

import java.io.*;

public class Copy1 {
    public static void main(String[] args) {
        if(args.length != 2){
            System.out.println("输入参数不对");
            System.out.println("例如：java Copy 源程序路径 目标文件路径");
            System.exit(1);
        }
        File f1 = new File(args[0]);
        File f2 = new File(args[1]);

        if(!f1.exists()){
            System.out.println("文件不存在");
        }
        InputStream input = null;
        OutputStream output = null;
        try{
            input = new FileInputStream(f1);
        }catch (Exception e){
            e.printStackTrace();
        }
        try{
            output = new FileOutputStream(f2);
        }catch (Exception e){
            e.printStackTrace();
        }
        if(input != null && output != null){
            int temp = 0;
            try{
                while((temp = input.read())!= -1){
                    output.write(temp);
                    System.out.println(temp);
                }
                System.out.println("-----------------");
                System.out.println("复制完成！");
            }catch (Exception e){
                e.printStackTrace();
                System.out.println("复制失败");
            }
            try{
                input.close();
                output.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}
