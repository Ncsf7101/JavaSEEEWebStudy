package com.rqiang.Java18.layoutdemo;

import org.junit.Test;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo01 {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Flow Layout");
        jf.setLayout(new FlowLayout(FlowLayout.CENTER, 3, 3));
        JButton jb = null;
        for(int i = 1; i<=9; i++){
             jb = new JButton("按钮"+ i);
            jf.add(jb);
        }
        //jf.setSize(800, 300);
        jf.pack();
        jf.setVisible(true);
    }


}
