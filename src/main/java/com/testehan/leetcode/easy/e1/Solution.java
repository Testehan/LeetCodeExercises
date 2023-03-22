package com.testehan.leetcode.easy.e1;

// 1. Two Sum

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        int [] result = new int[2];
        Map<Integer, Integer> tracker = new HashMap<>();
        for(int i = 0; i< nums.length;i++){
            if (tracker.containsKey(nums[i])){
                result[0] = tracker.get(nums[i]);
                result[1]=i;
            } else{
                tracker.put(target-nums[i],i);
            }

        }
        return result;
    }

}
