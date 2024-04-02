package com.ashu.HRT;

import java.util.*;

public class Loops {
    public static void main(String[] args) {
        complexcal(2, 0, 0);
        complexcal(0, 2, 10);
    }

    private static void complexcal(int a, int b, int n) {
        int sum = 0;
        int temp = 0;
        int temps = 0;
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                temps = 1;
            }
            sum = a + (2 * temps) * b;
            temps = 2 * temps;
            temp = temp + sum;
            System.out.print(temp + " ");
        }
        System.out.println();

    }
}
