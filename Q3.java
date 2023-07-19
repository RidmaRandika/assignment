package com.company;

public class Q3 {
    public static void main(String[] args) {
        int val1 =0 , val2 = 1 , val3 =0;
        System.out.print(val1+" "+val2+" ");
        for (int i = 0; i < 100; i++) {
            val3 = val1+val2;
            val1 = val2;
            val2 = val3;
            System.out.print(" " + val3);
        }
    }
}
