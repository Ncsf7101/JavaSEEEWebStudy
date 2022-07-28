package com.rqiang.Java18.jlabeldemo;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class JLabelDemo02 {
    public static void main(String[] args) throws Exception {
        /*
        File f = new File("E:" + File.separator + "JavaFile"
                + File.separator + "copyPhoto2.png");
        InputStream inp = new FileInputStream(f);
        byte[] b = new byte[(int) f.length()];
        inp.read(b);
        inp.close();
        */
        Icon icon = new ImageIcon("E:" + File.separator + "JavaFile"
                + File.separator + "copyPhoto2.png");
        JFrame jf = new JFrame("icon");
        JLabel jl = new JLabel("图片", icon, JLabel.CENTER);
        jf.add(jl);
        jf.setSize(500, 300);
        jf.setVisible(true);
    }
}
