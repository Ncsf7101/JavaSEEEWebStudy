package com.rqiang.Java11;

import java.util.Date;

public class Date1 {
    public static void main(String[] args) {
        long cur = System.currentTimeMillis();
        System.out.println(new Date(cur));
        System.out.println(new Date(cur).getTime());
    }
}
