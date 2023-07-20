package com.testehan.leetcode.easy.e1512;

// 1512. Number of Good Pairs

public class Solution {

    public  static int numIdenticalPairs(int[] nums) {
        int nPairs = 0;
        for (int i =0;i<nums.length-1;i++){
            for (int j = i+1; j<nums.length;j++){
                if (nums[i]==nums[j] && i<j){
                    nPairs++;
                }
            }
        }
        return nPairs;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));

        int[] nums2 = {1,1,1,1};
        System.out.println(numIdenticalPairs(nums2));
    }
}
