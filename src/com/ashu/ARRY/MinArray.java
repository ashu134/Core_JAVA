package com.ashu.ARRY;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        int[] output = readInteger(5);
        System.out.println(Arrays.toString(output));
        findMin(output);

    }

    public static int[] readInteger(int x) {
        Scanner sc = new Scanner(System.in);
        int[] u_arr = new int[x];
        for (int i = 0; i < x; i++) {
            System.out.print("Enter your integer: ");
            int u_in = sc.nextInt();
            u_arr[i] = u_in;
        }
        return u_arr;
    }

    public static void findMin(int[] arr) {
        int[] x = arr;
        Arrays.sort(x);
        int y = arr[0];
        System.out.println(y);
    }
}
