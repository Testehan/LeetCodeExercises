package com.testehan.leetcode.easy.e1389;

// 1389. Create Target Array in the Given Order

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> result = new LinkedList<>();

        for (int i =0; i<nums.length;i++){
            result.add(index[i],nums[i]);
        }

        int[]rez = new int[result.size()];
        int j = 0;
        for (Integer i: result) {
            rez[j] = i;
            j++;
        }
        return rez;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};

        System.out.println(Arrays.toString(createTargetArray(nums,index)));


    }
}
