package com.testehan.leetcode.easy.e594;

// 594. Longest Harmonious Subsequence

public class Solution {

    public static int findLHS(int[] nums) {
        int max = 0;
        for (int i =0;i<nums.length;i++){
            int current=0;
            boolean isDifferent = false;
            for (int j=0;j<nums.length;j++){
                if(nums[j]-nums[i]==1){
                    current++;
                    isDifferent= true;
                }
                if (nums[j]-nums[i]==0){
                    current++;
                }
            }
            if (current>max && isDifferent){
                max = current;
            }
        }
        return max;
    }

    public static void main(String[] args) {
//        int[] nums = {1,3,2,2,5,2,3,7};
//        int[] nums = {1,2,3,4};
        int[] nums = {0,0,0,0};

        System.out.println(findLHS(nums));

    }
}
