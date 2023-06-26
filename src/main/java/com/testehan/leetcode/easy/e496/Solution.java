package com.testehan.leetcode.easy.e496;

// 496. Next Greater Element I

import java.util.Arrays;

public class Solution {

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        for (int i=0;i<nums1.length;i++){
            int position = findPosition(nums1[i],nums2);
            boolean found = false;
            for(int j =position;j<nums2.length;j++){
                if (nums2[j]>nums2[position]){
                    result[i] = nums2[j];
                    found=true;
                    break;
                }
            }
            if (!found){
                result[i] = -1;
            }
        }
        return result;
    }

    private static int findPosition(int number, int[] nums2) {
        int position = -1;
        for (int i = 0; i<nums2.length;i++){
            if (nums2[i]==number){
                position = i;
                break;
            }
        }
        return position;
    }

    public static void main(String[] args) {
       int[] nums1 = {4,1,2};
       int[] nums2 = {1,3,4,2};

        System.out.println(Arrays.toString(nextGreaterElement(nums1,nums2)));
    }
}
