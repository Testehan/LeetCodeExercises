package com.testehan.leetcode.easy.e1365;

// 1365. How Many Numbers Are Smaller Than the Current Number

import java.util.Arrays;

public class Solution {

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] results = new int[nums.length];

        for (int i =0;i<nums.length;i++){
            int noOfSmallerNumbers = 0;
            for (int j = 0; j< nums.length; j++){
                if (nums[i]>nums[j]){
                    noOfSmallerNumbers++;
                }
            }
            results[i] = noOfSmallerNumbers;
        }

        return results;
    }

    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};

        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
}
