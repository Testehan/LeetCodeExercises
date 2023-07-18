package com.testehan.leetcode.easy.e724;

// 724. Find Pivot Index

public class Solution {

    public static int pivotIndex(int[] nums) {
        int leftSum=0, rightSum=0;

        for (int i=0;i<nums.length;i++){
            if (i==0){
                if (leftSum == sum(nums,i+1,nums.length-1)){
                    return 0;
                }
            } else if (i==nums.length-1){
                if (sum(nums,0,nums.length-2)==rightSum){
                    return nums.length-1;
                }
            } else {
                if (sum(nums,0,i-1)==sum(nums,i+1,nums.length-1)){
                    return i;
                }
            }
        }

        return -1;
    }

    // sum between 2 indexes
    private static int sum(int[] nums, int i, int i1) {
        int sum=0;
        for (int j=i;j<=i1;j++){
            sum = sum + nums[j];
        }

        return sum;
    }

    public static void main(String[] args) {
//        int[] nums = {1,7,3,6,5,6};  //3
//        int[] nums = {1,2,3};   // -1
        int[] nums = {2,1,-1};   // 0

        System.out.println(pivotIndex(nums));
    }
}
