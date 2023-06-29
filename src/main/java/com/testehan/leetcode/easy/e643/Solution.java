package com.testehan.leetcode.easy.e643;

// 643. Maximum Average Subarray I

public class Solution {

    // with this solution i get Time Limit Exceeded
//    public static double findMaxAverage(int[] nums, int k) {
//
//        double maxAverage = Double.NEGATIVE_INFINITY;
//
//        for (int i=0;i<nums.length;i++){
//            double currentAverage = 0;
//            if(i+k<=nums.length) {
//                for (int j = i; j < i + k; j++) {
//                    currentAverage = currentAverage + nums[j];
//                }
//                currentAverage = currentAverage / k;
//                if (currentAverage>maxAverage){
//                    maxAverage=currentAverage;
//                }
//            }
//        }
//
//        return maxAverage;
//
//    }

    public static double findMaxAverage(int[] nums, int k) {
        long sum = 0;
        // compute sum of first k
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        long max = sum;

        // then simply go through the rest of numbers, by substracting the oldest and adding the newest numbers
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            max = Math.max(max, sum);
        }

        return (double)max/k;
    }

    public static void main(String[] args) {
//        int[] nums = {1,12,-5,-6,50,3};
//        int k = 4;

        int[] nums = {-1};
        int k = 1;

        System.out.println(findMaxAverage(nums,k));
    }
}
