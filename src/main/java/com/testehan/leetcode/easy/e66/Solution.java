package com.testehan.leetcode.easy.e66;

// 66. Plus One

import java.util.Arrays;

public class Solution {

    public static int[] plusOne(int[] digits) {

        boolean reminderPresent = true;
        int i = digits.length-1;
        while (reminderPresent && i>-1){
            if ( digits[i]+1>9){
                digits[i] = 0;
                i--;
            } else {
                digits[i] =  digits[i] + 1;
                reminderPresent = false;
            }
        }

        // means that we have 1 reminder left but that we need to extend the array
        if (i==-1){
            int [] digits2 = new int[digits.length+1];
            System.arraycopy(digits,0,digits2,1,digits.length);
            digits2[0] = 1;
            digits = digits2;
        }

        return digits;
    }

    public static void main(String[] args) {
        int[] digits1 = {1,2,3};
        int[] digits2 = {4,3,2,1};
        int[] digits3 = {9};

        System.out.println(Arrays.toString(plusOne(digits1)));
        System.out.println(Arrays.toString(plusOne(digits2)));
        System.out.println(Arrays.toString(plusOne(digits3)));
    }

}
