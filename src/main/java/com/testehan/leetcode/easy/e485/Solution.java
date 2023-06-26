package com.testehan.leetcode.easy.e485;

// 485. Max Consecutive Ones

public class Solution {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int sumMax = 0;
        int sum = 0;
        for (int i =0;i<nums.length;i++){
            if (nums[i]==0){
                if (sum>sumMax){
                    sumMax = sum;
                }
                sum = 0;
            } else {
                sum++;
            }
        }

        return sum>sumMax ? sum : sumMax;
    }

    public static void main(String[] args) {
//        int[] nums = {1,1,0,1,1,1};     // 3
        int[] nums = {1,0,1,1,0,1};     // 2

        System.out.println(findMaxConsecutiveOnes(nums));
    }

}
