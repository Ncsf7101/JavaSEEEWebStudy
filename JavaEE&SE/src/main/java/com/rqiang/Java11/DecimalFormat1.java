package com.rqiang.Java11;

import java.text.DateFormat;
import java.text.DecimalFormat;

class Demo1{
    public void fomat1(String pattern, double value){
        DecimalFormat dec = null;
        dec = new DecimalFormat(pattern);
        String val = dec.format(value);
        System.out.println(pattern + "|\t-----|" +val);
    }
}

public class DecimalFormat1 {
    public static void main(String[] args) {
        Demo1 demo = new Demo1();
        demo.fomat1("000,000.0000", 1111111);
        demo.fomat1("-###,###.###$", 1111111.0);
        demo.fomat1("###,###.###%$", 0.03444);
    }
}
