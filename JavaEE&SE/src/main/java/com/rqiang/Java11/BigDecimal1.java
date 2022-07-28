package com.rqiang.Java11;

import java.math.BigDecimal;

public class BigDecimal1 {
    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal(10.345);
        BigDecimal b2 = new BigDecimal(3.333);
        BigDecimal b3 = new BigDecimal(b1.multiply(b2).doubleValue());
        System.out.println(b3.divide(BigDecimal.valueOf(1), 2, BigDecimal.ROUND_HALF_UP).doubleValue());

    }

    public static void round(double d, int len){

    }
}
