package com.testehan.leetcode.easy.e2160;

// 2160. Minimum Sum of Four Digit Number After Splitting Digits

import java.util.Arrays;

public class Solution {

    public static int minimumSum(int num) {
        int[] digits = new int[4];
        int i =0;
        while (num >0){
            digits[i] = num % 10;
            num = num / 10;
            i++;
        }

        Arrays.sort(digits);

        int num1 = digits[0]*10 + digits[2];
        int num2 = digits[1]*10 + digits[3];

        return num1+num2;

    }

    public static void main(String[] args) {

        System.out.println(minimumSum(2932));
    }
}
