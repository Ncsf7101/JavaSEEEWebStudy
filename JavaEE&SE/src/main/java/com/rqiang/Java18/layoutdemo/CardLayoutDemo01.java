package com.rqiang.Java18.layoutdemo;

import javax.swing.*;
import java.awt.*;

public class CardLayoutDemo01 {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Card Layout");
        Container cont = jf.getContentPane();
        CardLayout card = new CardLayout();
        jf.setLayout(card);
        JButton jb = null;
        Label l = null;
        for(int i = 1; i<=9; i++){
            l = new Label("标签-"+i, JLabel.CENTER);
            cont.add(""+i, l);

        }
        //jf.setSize(800, 300);
        jf.pack();
        jf.setVisible(true);
        card.show(cont, "8");
        for(int i = 0; i<9; i++)
        {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            card.next(cont);
        }
    }
}
