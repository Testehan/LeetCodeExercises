package com.testehan.leetcode.easy.e448;

// 448. Find All Numbers Disappeared in an Array

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int[] presence = new int[nums.length+1];
        List<Integer> result = new ArrayList<>();

        for (int i =0;i<nums.length;i++){
            presence[nums[i]] = 1;
        }

        for (int i =1;i<presence.length;i++){
            if (presence[i]!=1){
                result.add(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};

        System.out.println(findDisappearedNumbers(nums));
    }
}
