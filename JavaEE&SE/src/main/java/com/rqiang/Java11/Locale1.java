package com.rqiang.Java11;
import sun.misc.resources.Messages;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class Locale1 {
    public static void main(String[] args) {
        Locale zhLoc = new Locale("zh", "CN");
        Locale enLoc = new Locale("en", "US");
        Locale frLoc = new Locale("fr", "FR");
        ResourceBundle zhrb = ResourceBundle.getBundle("Message", zhLoc);
        ResourceBundle enrb = ResourceBundle.getBundle("Message", enLoc);
        ResourceBundle frrb = ResourceBundle.getBundle("Message", frLoc);
        System.out.println("中文：" + MessageFormat.format(zhrb.getString("info"), "李兴华"));
        System.out.println("英文：" + MessageFormat.format(enrb.getString("info"), "LiXingHua"));
        System.out.println("法文：" + MessageFormat.format(frrb.getString("info"), "LiXingHua"));
    }
}
