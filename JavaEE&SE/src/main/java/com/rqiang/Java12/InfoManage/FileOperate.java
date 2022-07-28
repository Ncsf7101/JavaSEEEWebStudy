package com.rqiang.Java12.InfoManage;

import java.io.*;
import java.util.ArrayList;

public class FileOperate {

    public void ser(ArrayList<Object> pers) throws Exception {
        File f = new File("E:" + File.separator + "JavaFile" + File.separator + "Per数据库.txt");
        ObjectOutputStream oos = null;
        OutputStream out = new FileOutputStream(f);
        oos = new ObjectOutputStream(out);
        oos.writeObject(pers);
    }

    public ArrayList<Object> dser() throws Exception{
        File f = new File("E:" + File.separator + "JavaFile" + File.separator + "Per数据库.txt");
        ObjectInputStream ips = null;
        InputStream input = new FileInputStream(f);
        ips = new ObjectInputStream(input);
        ArrayList<Object> pers = (ArrayList<Object>) ips.readObject();
        return pers;
    }
}
