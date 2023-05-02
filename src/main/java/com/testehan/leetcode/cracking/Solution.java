package com.testehan.leetcode.cracking;

// you are given a string s and a number k; remove from s all initial adjacent consecutive characters of length k

public class Solution {

    public static void main(String[] args) {
        String s = "ssassassinatess";
        int k = 2;

        int curLength = 1;
        int first = 0, last = 0; // first and last position to know what to remove.
        int lastChar = s.charAt(0);
        StringBuilder sb = new StringBuilder(s);
        int i =1;
        while (i<sb.length()){
            if (sb.charAt(i)==lastChar){
                curLength++;
                last=i;

                if (curLength==k){
                    sb.replace(first,last+1,"");
                    curLength = 0;
                    i = first;  // we want to have i and first on the same position after a removal
                } else{
                    i++;
                }
            } else {
                lastChar = sb.charAt(i);
                first=i;
                curLength = 1;
                i++;
            }

        }

        System.out.println(sb);
    }
}
