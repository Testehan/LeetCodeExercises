package com.testehan.leetcode.easy.e35;

// 35. Search Insert Position

public class Solution {
    public static int searchInsert(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]==target) {
                return mid;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int [] nums = {1,3,5,6};
        int [] nums2 = {1};
        int [] nums3 = {1,3};

        System.out.println(searchInsert(nums,  5));
//
        System.out.println(searchInsert(nums,  2));
//
        System.out.println(searchInsert(nums,  7));

        System.out.println(searchInsert(nums,  0));

        System.out.println(searchInsert(nums2,  1));

        System.out.println(searchInsert(nums3,  2));



//        System.out.println(1/2);
    }
}
