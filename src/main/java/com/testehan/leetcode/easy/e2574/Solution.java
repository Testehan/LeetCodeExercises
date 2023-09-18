package com.testehan.leetcode.easy.e2574;

// 2574. Left and Right Sum Differences

public class Solution {

    public static int[] leftRigthDifference(int[] nums) {
        int[] answer = new int[nums.length];
        for (int i=0;i<nums.length;i++){
            answer[i] = Math.abs(sumLeft(nums,i) - sumRight(nums,i));
        }

        return answer;
    }

    public static int sumRight(int[]nums, int index)
    {
        int sum=0;
        for (int i=0;i<index;i++){
            sum=sum+nums[i];
        }
        return sum;
    }

    public static int sumLeft(int[]nums, int index)
    {
        int sum=0;
        for (int i=index+1;i<nums.length;i++){
            sum=sum+nums[i];
        }
        return sum;
    }

    private static void printArray(int[] numbers){
        for (int i =0;i<numbers.length;i++){
            System.out.print(numbers[i] + " ");
        }
    }

    public static void main(String[] args) {
//        int[] nums = {10,4,8,3};
//        printArray(leftRigthDifference(nums));

        int[] nums = {1};
        printArray(leftRigthDifference(nums));
    }
}
