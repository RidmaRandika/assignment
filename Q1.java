package com.company;

public class Q1 {
    public static void main(String[] args) {
        int arr[] = {4,34,2,3,6,7,8,18,8,9};
        System.out.println("Sum from for loop :"+forLoopSum(arr));

        System.out.println("Sum from while loop :"+whileLoopSum(arr));

        System.out.println("Sum from recursion :"+recursion(arr, arr.length));
    }

    private static int forLoopSum(int[] arr ) {
        int tot = 0;
        for (int i = 0; i < arr.length; i++) {
            tot += arr[i];
        }
        return tot;
    }
    private static int whileLoopSum(int[] arr ) {
        int tot = 0,j = 0;
        while (j<arr.length){
            tot+= arr[j];
            j++;
        }
        return tot;
    }

    private static int recursion(int[] arr , int lngth) {
        int tot =0 , index = 0;
        if (lngth == 0){
            return 0;
        }
        lngth = lngth - 1;
        tot += arr[lngth] + recursion(arr,lngth);
        return tot;
    }
}
