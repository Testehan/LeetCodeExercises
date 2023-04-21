package com.testehan.leetcode.easy.e268;

// 268. Missing Number

public class Solution {

    public static int missingNumber(int[] nums) {
        int sum=0;
        for (int i : nums){
            sum = sum +i;
        }

        return (nums.length)*(nums.length+1)/2 - sum;
    }

    public static void main(String[] args) {
        int[] nums = {0,1, 2,3,4,6}; // 1 2 3 4 5 6

        System.out.println(missingNumber(nums));
    }
}
