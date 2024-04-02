package com.ashu.COLL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class TestArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, -19, 5, 6, 7, 8};
        TestArray testArray = new TestArray();
        System.out.println(testArray.sqrarray(nums));
    }

    public ArrayList sqrarray(int[] nums) {
        int[] initarray = new int[nums.length];
        ArrayList<Integer> al = new ArrayList<>();
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            a = nums[i];
            a = a * a;
            al.add(a);
            initarray[i] = a;
            Collections.sort(al);
        }
//        for(var x: initarray){
//            System.out.println(x);
//        }
        //System.out.println(al);
        return al;
    }
}
