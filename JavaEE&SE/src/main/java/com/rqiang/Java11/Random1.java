package com.rqiang.Java11;

import java.util.Arrays;

public class Random1 {
    public static void main(String[] args) {
        int[] a = new int[2];
        a[0] = 11;
        a[1] = 2;
        Arrays.sort(a);
        for (int i = 0; i<a.length; i++) {
            System.out.print(a[i]+"、");
        }

    }
}
