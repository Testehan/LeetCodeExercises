package com.testehan.leetcode.easy.e697;

import java.util.HashMap;
import java.util.Map;


// 697. Degree of an Array      this is a medium/hard problem...not an easy one


public class Solution {

    public static int findShortestSubArray(int[] nums) {

        Map<Integer, Integer> count = new HashMap<>();
        Map<Integer, Integer> first = new HashMap<>();

        int res = 0;
        int degree = 0;

        for (int i = 0; i < nums.length; ++i) {
            first.putIfAbsent(nums[i], i);
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);

            if (count.get(nums[i]) > degree) {          // we have a new max frequency
                degree = count.get(nums[i]);
                res = i - first.get(nums[i]) + 1;           // trying to find the current length for this new degree
            } else if (count.get(nums[i]) == degree)
                res = Math.min(res, i - first.get(nums[i]) + 1);        // trying to see if current length or a previous one is smaller,
                                                                        // and choosing the smaller one.
        }
        return res;
    }

    public static void main(String[] args) {

        int[] nums = {1,2,2,3,1};

        System.out.println(findShortestSubArray(nums));
    }
}
