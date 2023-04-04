package com.testehan.leetcode.easy.e125;

// 125. Valid Palindrome

public class Solution {

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^0-9a-z]", "");

        boolean isPalindrome = true;
        int i=0;
        while(i<s.length()/2){
            int last = s.length() -1 -i;
            if (s.charAt(i) != s.charAt(last)){
                isPalindrome = false;
            }
            i++;
        }
        return isPalindrome;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
