package com.ashu.ARRY;

import java.util.Arrays;

public class SumTWO {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 9, 5, 3, 4, 6, 56, 2, 4, 4, 4, 5, 5, 5, 8, 8, 99, 6, 6, 6, 7, 87, 65};
        System.out.println(Arrays.toString(sum(nums,11)));
    }





    public static int[] sum(int[] nums,int target) {
        int[] res = new int[0];
        if (2 <= nums.length && nums.length < 1000) {
            res = new int[2];
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        res[0] = nums[i];
                        res[1] = nums[j];
                    }
                }
            }
            //return res;
        }
        return res;
    }
}
