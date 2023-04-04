package com.testehan.leetcode.easy.e169;

// 169. Majority Element

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static int majorityElement(int[] nums) {
        Map<Integer,Integer> occurences = new HashMap<>();
        int maxOccurences = 0;
        int element = 0;

        for (int i =0; i<nums.length;i++){
            int currentOccurences = occurences.get(nums[i]) != null ? occurences.get(nums[i]) : 0;
            currentOccurences++;

            if (currentOccurences>maxOccurences){
                maxOccurences = currentOccurences;
                element = nums[i];
            }
            occurences.put(nums[i],currentOccurences);
        }
        return element;
    }

    public static void main(String[] args) {
        int[] numbers = {4,1,2,1,2};
        System.out.println(majorityElement(numbers));
    }
}
