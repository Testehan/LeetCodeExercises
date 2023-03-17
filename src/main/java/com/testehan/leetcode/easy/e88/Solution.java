package com.testehan.leetcode.easy.e88;

// 88. Merge Sorted Array

import java.util.Arrays;

public class Solution {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int tail1 = m - 1;
        int tail2 = n - 1;
        int finished = m + n - 1;

        while (tail1 >= 0 && tail2 >= 0) {
            nums1[finished--] = (nums1[tail1] > nums2[tail2]) ? nums1[tail1--] : nums2[tail2--];
        }

        while (tail2 >= 0) { //only need to combine with remaining nums2, if any
            nums1[finished--] = nums2[tail2--];
        }
    }

    public static void main(String[] args) {
       int [] nums1 = {1,2,3,0,0,0,0,0};
       int [] nums2 = {4,5,6,7,8};

//        int [] nums1 = {0};
//        int [] nums2 = {1};

       merge(nums1,3,nums2,5);

       System.out.println(Arrays.toString(nums1));
    }
}
