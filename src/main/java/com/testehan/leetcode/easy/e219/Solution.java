package com.testehan.leetcode.easy.e219;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        // V1 this does not work on all testcases...it fails because of time limits
//        for (int i=0;i<nums.length;i++){
//            for (int j=i+1;j<nums.length;j++){
//                if ((nums[i] == nums[j])&& Math.abs(i-j)<=k){
//                    return true;
//                }
//
//            }
//        }
//        return false;

        // V2
        Map<Integer,Integer> numbers = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            Integer previousIndex = numbers.put(nums[i],i);
            if (previousIndex != null && Math.abs(i-previousIndex)<=k){
                return true;
            }
        }

        return false;

    }


    public static void main(String[] args) {
        int[] numbers = {1,2,3,1,2,3};
        System.out.println(containsNearbyDuplicate(numbers,2));
    }
}
