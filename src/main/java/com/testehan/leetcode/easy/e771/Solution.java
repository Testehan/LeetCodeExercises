package com.testehan.leetcode.easy.e771;

// 771. Jewels and Stones

public class Solution {

    public static int numJewelsInStones(String jewels, String stones) {
        int num=0;
        for (int i=0;i<stones.length();i++) {
            if (jewels.indexOf(stones.charAt(i))>-1){
                num++;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        String jewels = "aA", stones = "aAAbbbb";

        System.out.println(numJewelsInStones(jewels,stones));
    }
}
