package com.testehan.leetcode.easy.e350;

// 350. Intersection of Two Arrays II

import java.util.*;

public class Solution {

    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> frequencyNums1 = extracted(nums1);
        Map<Integer, Integer> frequencyNums2 = extracted(nums2);
        List<Integer> intersection = new ArrayList<>();

        for (Map.Entry<Integer,Integer> entry : frequencyNums1.entrySet()){
            if (frequencyNums2.containsKey(entry.getKey())){
                int howManyTimes = Math.min(frequencyNums2.get(entry.getKey()), entry.getValue());
                for (int i =1;i<=howManyTimes;i++){
                    intersection.add(entry.getKey());
                }
            }
        }

        int[] result = new int[intersection.size()];
        int i =0;
        for (Integer num: intersection) {
            result[i] = num;
            i++;
        }

        return result;
    }

    private static Map<Integer,Integer> extracted(int[] nums1) {
        Map<Integer, Integer> frequencyNums1 = new HashMap<>();
        for (int n : nums1){
            if (frequencyNums1.containsKey(n)){
                int old = frequencyNums1.get(n);
                old ++;
                frequencyNums1.put(n,old);
            } else {
                frequencyNums1.put(n,1);
            }
        }
        return frequencyNums1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        System.out.println(Arrays.toString(intersect(nums1,nums2)));
    }
}
