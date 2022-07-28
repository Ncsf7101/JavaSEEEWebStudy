package com.rqiang.Java11;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Calendar1 {
    public static void main(String[] args) {
        Calendar cal = null;
        cal = new GregorianCalendar();
        System.out.println(new Date());
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(Calendar.YEAR);
        System.out.println(cal.get(Calendar.MONTH));
        System.out.println(Calendar.MONTH);
    }
}
