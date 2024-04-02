package com.ashu.ARRY;

import java.util.Arrays;
import java.util.Random;

public class SearchNMatch {
    public static void main(String[] args) {
        String[] arrray = new String[5];
        String[] newarrray = {"Aashu", "Amar", "Dinu", "Briz", "Monu"};
        Arrays.sort(newarrray);
        System.out.println(Arrays.toString(newarrray));
        if (Arrays.binarySearch(newarrray, "Amar") >= 0) {
            System.out.println("Match Found");
        }
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {2, 3, 4, 5, 6, 1};
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Both are equal array");
        } else {
            System.out.println("Both are not equal");
        }


        Random random = new Random(100);
        int[] arraytest = new int[10];
        for (int i = 0; i < arraytest.length; i++) {
            arraytest[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(arraytest));
        Arrays.sort(arraytest);
        System.out.println(Arrays.toString(arraytest));

        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < arraytest.length - 1; i++) {
                if (arraytest[i] < arraytest[i + 1]) {
                    int temp = 0;
                    temp = arraytest[i];
                    arraytest[i] = arraytest[i + 1];
                    arraytest[i + 1] = temp;
                    flag = true;
                }
            }
        }
        System.out.println(Arrays.toString(arraytest));
    }
}
