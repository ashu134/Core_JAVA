package com.ashu.ARRY;

import java.util.Arrays;

public class ArrayReferences {
    public static void main(String[] args) {
        int[] myintArr= new int[6];
        int[] anotherarr=myintArr;
        int[] anotherarr1 =anotherarr;

        System.out.println(Arrays.toString(anotherarr1));
        myintArr[0]=90;
        //left variable will reference to right side array
        System.out.println(Arrays.toString(anotherarr));
        anotherarr1[2]=10;
        System.out.println(Arrays.toString(anotherarr1));
        ModifyArray(anotherarr);
        System.out.println(Arrays.toString(anotherarr));
    }
    private static void ModifyArray(int[] arr){
        arr[5]=20;
    }
}
