package com.testehan.leetcode.easy.e9;

// 9. Palindrome Number

public class Solution {

    public boolean isPalindrome(int x) {
        // Sol 1
        // String s = (new Integer(x)).toString();
        // char[] chars= s.toCharArray();
        // for (int i=0;i<chars.length/2;i++){
        //     if (chars[i] != chars[chars.length-1-i]){
        //         return false;
        //     }
        // }
        // return true;

        // Sol 2
        // if (x < 0 || (x!= 0 && x%10 == 0)){
        //     return false;
        // }
        // int newNumber = 0;
        // while (x>newNumber){
        //     newNumber = newNumber*10 + x%10;
        //     x = x / 10;
        // }
        // return (x==newNumber || x==newNumber/10);

        // sol 3
        int tmp = x, cache = 0;
        while(tmp > 0){
            cache = cache*10 + tmp % 10;
            tmp /= 10;
        }
        return x >= 0 && cache == x;
    }

}
