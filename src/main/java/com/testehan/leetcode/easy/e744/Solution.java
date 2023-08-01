package com.testehan.leetcode.easy.e744;

// 744. Find Smallest Letter Greater Than Target

public class Solution {
    public static char nextGreatestLetter(char[] letters, char target) {
        int intTarget = target;
        char answer = letters[0];
        for (char c : letters){
            int i = c;
            if (i>intTarget){
                answer=c;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'a';

        System.out.println(nextGreatestLetter(letters,target));
    }
}
