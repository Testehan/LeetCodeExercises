package com.testehan.leetcode.easy.e645;

// 645. Set Mismatch

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        int duplicate = 0;
        for (int i : nums){
            if (!set.contains(i)) {
                sum = sum + i;
                set.add(i);
            } else {
                duplicate = i;
            }
        }

        int missing = (nums.length*(nums.length+1))/2 - sum;


        return new int[]{duplicate, missing};
    }

    public static void main(String[] args) {
//        int[] nums = {1,2,2,4};
        int[] nums = {1,1};

        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
}
