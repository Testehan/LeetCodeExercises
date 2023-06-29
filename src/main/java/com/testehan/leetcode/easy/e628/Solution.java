package com.testehan.leetcode.easy.e628;

// 628 Maximum Product of Three Numbers

public class Solution {

    public static int maximumProduct(int[] nums) {
        int min1, min2, max1, max2, max3;

        min1 = min2 = Integer.MAX_VALUE;
        max1 = max2 = max3 = Integer.MIN_VALUE;

        for (int i :nums) {
            if (max1 < i) {
                max3 = max2;
                max2 = max1;
                max1 = i;
            } else if (max2 < i) {
                max3 = max2;
                max2 = i;
            } else if (max3 < i) {
                max3 = i;
            }

            //Updating minimums
            if (min1 > i) {
                min2 = min1;
                min1 = i;
            } else if (min2 > i) {
                min2 = i;
            }
        }

        return Math.max(min1*min2*max1, max1*max2*max3);
    }



    public static void main(String[] args) {
//        int[] nums = {1,2,3,4};
        int[] nums = {-1,-2,-3};

        System.out.println(maximumProduct(nums));
    }
}
