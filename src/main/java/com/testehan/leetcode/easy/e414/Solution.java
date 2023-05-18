package com.testehan.leetcode.easy.e414;

// 414. Third Maximum Number

public class Solution {
    public static int thirdMax(int[] nums) {
        Integer first = null;
        Integer second = null;
        Integer third = null;

        for (Integer n : nums){
            if (n.equals(first) || n.equals(second) || n.equals(third)) continue;

            if (first==null || n > first){
                third = second;
                second = first;
                first = n;
            } else if (second==null || n >second){
                third = second;
                second = n;
            } else if (third == null || n>third){
                third = n;
            }
        }

        return third!=null ? third : first;
    }

    public static void main(String[] args) {
//        int [] nums = {1,2,2,5,3,5};
//        int [] nums = {1,2};
//        int [] nums = {3,2,1};
//        int [] nums = {1,2,-2147483648};
        int [] nums = {2,2,3,1};
//        int [] nums = {2,2,3,1};

        System.out.println(thirdMax(nums));
    }
}
