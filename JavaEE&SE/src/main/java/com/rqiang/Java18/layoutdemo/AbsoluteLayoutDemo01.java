package com.rqiang.Java18.layoutdemo;

import javax.swing.*;
import java.awt.*;

public class AbsoluteLayoutDemo01 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Welcome To MyApplication");
        Container cont = f.getContentPane();
        f.setLayout(null);
        JLabel title = new JLabel("Zrqiang", JLabel.CENTER);
        JButton jb1 = new JButton("进入");
        JButton jb2 = new JButton("帮助");
        f.setSize(200, 90);
        title.setBounds(0, 0, 200, 20);
        jb1.setBounds(10, 30, 80, 20);
        jb2.setBounds(100, 30, 80, 20);

        cont.add(title);
        cont.add(jb1);
        cont.add(jb2);

        f.setVisible(true);

    }


}
