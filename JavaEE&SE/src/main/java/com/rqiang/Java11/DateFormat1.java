package com.rqiang.Java11;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormat1 {
    public static void main1(String[] args) {
        DateFormat dat1 = DateFormat.getDateInstance(DateFormat.YEAR_FIELD, new Locale("zh", "CN"));
        DateFormat dat2 = DateFormat.getDateTimeInstance(DateFormat.YEAR_FIELD, DateFormat.ERA_FIELD, new Locale("zh", "CN"));
        System.out.println(dat1.format(new Date()));
        System.out.println(dat2.format(new Date()));
    }

    public static void main2(String[] args) throws ParseException {
        Date dat = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance();
        String date1 = dateFormat.format(dat);
        String pattern1 = "yyyy@MM@dd@ HH@mm@ss@";//SSS@
        String pattern3 = "yyyy-MM-dd HH:mm:ss";
        String pattern2 = "yyyy黏MM月dd日 HH小时mm分钟ss秒钟";//SSS毫秒
        SimpleDateFormat p1 = new SimpleDateFormat(pattern1);
        SimpleDateFormat p3 = new SimpleDateFormat(pattern3);
        SimpleDateFormat p2 = new SimpleDateFormat(pattern2);
        System.out.println(p3.parse(date1));
        System.out.println(p2.format(p3.parse(date1)));
        System.out.println(p1.format(p3.parse(date1)));
        System.out.println(p3.format(p3.parse(date1)));
    }

    public static void main(String[] args) throws ParseException {
        String strDate = "2022-06-06 03:38:45.345";
        String pat = "yyyy-MM-dd HH:mm:ss.SSS";
        DateFormat dat = DateFormat.getDateTimeInstance();
        String datStr = dat.format(new Date());
        SimpleDateFormat p = new SimpleDateFormat(pat);
        System.out.println(datStr);
        System.out.println(p.parse(strDate));
        System.out.println(p.format(p.parse(strDate)));
    }

}
