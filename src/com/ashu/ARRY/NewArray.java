package com.ashu.ARRY;

import java.util.Arrays;
import java.util.Random;

public class NewArray {
    public static void main(String[] args) {
        int[] firstarray = getRandomArray(10);
        Arrays.sort(firstarray);
        System.out.println(Arrays.toString(firstarray));

        int[] SecondArray= new int[8];
        System.out.println(Arrays.toString(SecondArray));
        Arrays.fill(SecondArray,4);
        System.out.println(Arrays.toString(SecondArray));

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] fourthArray = Arrays.copyOf(thirdArray,thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));

        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(fourthArray));

        int[] largeArray = Arrays.copyOf(thirdArray,11);
        System.out.println(Arrays.toString(largeArray));
    }

 private static int[] getRandomArray(int len){
     Random random=new Random();
     int[] newInt =new int[len];
     for(int i=0;i<len;i++){
         newInt[i]=random.nextInt(100);
     }
     return  newInt;
 }
}