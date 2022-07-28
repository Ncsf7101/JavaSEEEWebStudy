package com.rqiang.Java18.jframedemo;

import javax.swing.*;
import java.awt.*;

public class JFrameDemo01 {
    public static void main(String[] args) {
        JFrame f = new JFrame("First Window");
        f.setSize(300, 200);
        f.setBackground(Color.MAGENTA);
        f.setLocation(400, 400);
        f.setVisible(true);
    }
}
