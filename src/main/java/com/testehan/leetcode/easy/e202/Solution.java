package com.testehan.leetcode.easy.e202;

// 202. Happy Number
// https://www.geeksforgeeks.org/floyds-cycle-finding-algorithm/

public class Solution {
    public static boolean isHappy(int n) {
        if (n==1){
            return true;
        }

        int s = n, f = n;       // slow and fast. I will use the Tortoise and the Hare algorithm
        do {
            s = getSumOfDigitsSquared(s);                           // tortoise only 1 step
            f = getSumOfDigitsSquared(getSumOfDigitsSquared(f));    // hare does 2 steps at once

            if (s==1){
                return true;
            }
        } while (s != f); // if they are equal then we are in a cycle and we should just get out as the number is not happy
        return false;
    }

    private static int getSumOfDigitsSquared(int n) {
        int sum = 0;
        while (n >9){
            int lastDigit = n %10;
            n = n / 10;
            sum = sum + lastDigit*lastDigit;
        }
        int lastDigit = n %10;
        sum = sum + lastDigit*lastDigit;
        return sum;
    }

    public static void main(String[] args) {
//        System.out.println(isHappy(19)); // true

        System.out.println(isHappy(2)); // false
    }
}
