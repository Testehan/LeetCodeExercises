package com.testehan.leetcode.easy.e1470;

public class Solution {

    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[2*n];
        int j = 0;
        for (int i=0;i<n;i++){
            result[j] = nums[i];
            j++;
            result[j] = nums[i+n];
            j++;
        }

        return result;
    }

    private static void printArray(int[] numbers){
        for (int i =0;i<numbers.length;i++){
            System.out.print(numbers[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = {2,5,1,3,4,7};
        printArray(shuffle(array,3));

//        int[] array = {1,1,2,2};
//        printArray(shuffle(array,2));
    }

}
