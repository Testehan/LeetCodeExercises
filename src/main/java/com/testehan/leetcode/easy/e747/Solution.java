package com.testehan.leetcode.easy.e747;

// 747. Largest Number At Least Twice of Others

public class Solution {

    public static int dominantIndex(int[] nums)
    {
        int max = 0;
        int maxIndex=-1;
        for (int i=0;i<nums.length;i++){
            if (nums[i]>max){
                max = nums[i];
                maxIndex=i;
            }
        }

        boolean isDominant = true;
        for (int i=0;i<nums.length;i++){
            if (i!=maxIndex && nums[i]*2>max){
                isDominant = false;
            }
        }

        if (isDominant){
            return maxIndex;
        } else {
            return -1;
        }

    }

    public static void main(String[] args) {
//        int[] nums = {3,6,1,0};
        int[] nums = {1,2,3,4};

        System.out.println(dominantIndex(nums));
    }
}
