package com.testehan.leetcode.easy.e674;

// 674. Longest Continuous Increasing Subsequence

public class Solution {

    public static int findLengthOfLCIS(int[] nums) {
        if (nums.length==1){
            return 1;
        }

        int maxLength = 0;
        int currentLength = 1;
        for (int i=0;i<nums.length-1;i++){
            if (nums[i]<nums[i+1]){
                currentLength++;
                if ((i==nums.length-2)&& (currentLength>maxLength)){
                    maxLength=currentLength;
                }
            } else {
                if (currentLength>maxLength){
                    maxLength=currentLength;
                }
                currentLength=1;
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
//        int[] nums = {1,3,5,4,7};
//        int[] nums = {1,3,5,7};
        int[] nums = {1};

        System.out.println(findLengthOfLCIS(nums));
    }
}
