package com.testehan.leetcode.easy.e283;

// 283. Move Zeroes

import java.util.Arrays;

public class Solution {

    public static void moveZeroes(int[] nums) {

       // make sure that the non zero numbers are at the beginning of the array
       int i =0;
       for (int n : nums){
           if (n!=0){
               nums[i]=n;
               i++;
           }
       }

       // for the difference of numbers left, just put 0s
       for (int j = i; j<nums.length;j++){
           nums[j] = 0;
       }

    }

    public static void main(String[] args) {
//        int[] nums = {0,1,0,3,12};
        int[] nums = {0,0,3};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
