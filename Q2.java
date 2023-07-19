package com.company;

import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        String arr[] = {"a","b","c"};
        int brr[] = {1,2,3};
        Object crr [] = new Object[6];

        for (int i = 0; i <arr.length; i++) {
            crr[i*2] = arr[i];
            crr[(i*2)+1] = brr[i];
        }

        System.out.println(Arrays.toString(crr));
    }
}
