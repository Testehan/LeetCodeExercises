package com.testehan.leetcode.easy.e303;

public class NumArray {

    private int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int left, int right) {
        int sum = 0;
        for (int i=left;i<=right; i++){
            sum = sum+nums[i];
        }
        return sum;
    }

}
