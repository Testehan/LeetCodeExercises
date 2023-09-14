package com.testehan.leetcode.easy.e2413;

// 2413. Smallest Even Multiple

public class Solution {

    public int smallestEvenMultiple(int n) {
        if (n % 2 ==0){
            return n;
        }

        return n*2;
    }


    public static void main(String[] args) {

    }
}
