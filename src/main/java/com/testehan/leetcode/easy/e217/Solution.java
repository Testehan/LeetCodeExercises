package com.testehan.leetcode.easy.e217;

// 217. Contains Duplicate

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> singles = new HashSet<>();

        for (int i =0;i<nums.length;i++){
            if (singles.contains(nums[i])){
                return true;
            }
            singles.add(nums[i]);
        }

        return false;
    }


    public static void main(String[] args) {
        int[] numbers = {1,2,3,4};
        System.out.println(containsDuplicate(numbers));
    }

}
