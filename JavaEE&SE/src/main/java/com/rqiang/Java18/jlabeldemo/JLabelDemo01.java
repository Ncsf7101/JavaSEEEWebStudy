package com.rqiang.Java18.jlabeldemo;

import org.junit.Test;

import javax.swing.*;
import java.awt.*;

public class JLabelDemo01 {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Font Color");
        JLabel jl = new JLabel("NIHAO", JLabel.CENTER);
        Font f = new Font("TimesNewRoman", Font.ITALIC+Font.BOLD, 24);
        jl.setFont(f);
        jl.setForeground(Color.PINK);
        jf.add(jl);
        Dimension d1 = new Dimension(400, 800);
        jf.setSize(d1);

        Point p1 = new Point(Window.WIDTH/2, Window.HEIGHT/2);
        jf.setLocation(p1);
        jf.setVisible(true);

    }

    @Test
    public void h(){
        System.out.println(Window.WIDTH + "!!!" + Window.HEIGHT);
    }

}
