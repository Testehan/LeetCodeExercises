package com.testehan.leetcode.easy.e1281;

// 1281. Subtract the Product and Sum of Digits of an Integer

public class Solution {

    public static int subtractProductAndSum(int n) {
       int sum=0;
       int product=1;
       while (n>0){
           int digit = n%10;
           n = n/10;

           sum = sum + digit;
           product = product*digit;
       }

       return product-sum;
    }

    public static void main(String[] args) {

        System.out.println(subtractProductAndSum(234));

    }
}
