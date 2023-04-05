package com.testehan.leetcode.easy.e171;

// 171. Excel Sheet Column Number

public class Solution {

    public static int titleToNumber(String columnTitle) {
        int result=0;
        int i = columnTitle.length()-1;
        int power = 1;
        while (i>=0){
            char letter = columnTitle.charAt(i);
            result = result + (letter-'A'+1)*power;

            power = power*26;
            i--;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(titleToNumber("ZY"));
    }
}
