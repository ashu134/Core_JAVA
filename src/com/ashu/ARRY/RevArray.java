package com.ashu.ARRY;

import java.util.Arrays;

public class RevArray {
    public static void main(String[] args) {
        int[] arr = {23, 45, 65, 76, 77, 66, 22};
        //System.out.printf(Arrays.toString(reverse(arr)));
        reverse(arr);
        System.out.println(Arrays.toString(reverseInt(arr)));
    }

    //First Method to reverse the number
    public static void reverse(int[] arr) {
        int n = 0;
        n = arr.length;
        int temp1 = 0;
        int temp2 = 0;
        for (int i = 0; i < (n / 2); i++) {
            for (int j = n - 1 - i; j >= n / 2; j--) {
                temp1 = arr[i];
                temp2 = arr[j];
                arr[j] = temp1;
                arr[i] = temp2;
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //Second Method to reverse the Array
    private static int[] reverseInt(int[] arr) {
        int[] revarr = new int[arr.length];
        int maxindex = arr.length - 1;
        for (int i : arr) {
            revarr[maxindex--] = i;
        }
        return revarr;
    }
}
