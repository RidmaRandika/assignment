package com.company;

import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {
        int arr [] = { 50 , 2 ,1,9 } ;
        int brr[] = new int[arr.length];

        int fDigit = 0 , index =0 ;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 10 && arr[i] > fDigit){
                fDigit = arr[i];
                brr[0] = fDigit;
                index = i;
            }
        }
        System.out.print(fDigit);
        for (int j = 0; j < arr.length-1; j++) {
            if (arr[j] != fDigit){
                brr[j] = arr[j];
            }
            System.out.print(brr[j]);
        }

    }
}
