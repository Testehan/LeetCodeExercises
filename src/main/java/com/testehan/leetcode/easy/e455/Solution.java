package com.testehan.leetcode.easy.e455;

// 455. Assign Cookies

import java.util.Arrays;

public class Solution {

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0; // used for g array
        int j = 0; // used for s / size array
        while (i<g.length&&j<s.length){
            if (g[i]<=s[j]){
                i++;
            }
            j++;
        }
        return i;
    }

    public static void main(String[] args) {
        int [] g = {1,2};
        int [] s = {1,2,3};

        System.out.println(findContentChildren(g,s));
    }
}
