package com.testehan.leetcode.easy.e14;

// 14. Longest Common Prefix

public class Solution {

    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        if (strs.length==0){
            return "";
        } else if (strs.length==1){
            return strs[0];
        } else {
            int minLength = strs[0].length();
            String minString = strs[0];
            for (int i=1;i<strs.length;i++){
                if (strs[i].length() < minLength){
                    minLength = strs[i].length();
                    minString = strs[i];
                }
            }
            for (int i=0;i<strs.length;i++){
                while (!strs[i].startsWith(minString,0)){
                    minString = minString.substring(0,minString.length()-1);
                }
            }
            sb.append(minString);
        }
        return sb.toString();
    }
}
