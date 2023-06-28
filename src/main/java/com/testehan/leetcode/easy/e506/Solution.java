package com.testehan.leetcode.easy.e506;

// 506. Relative Ranks

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static String[] findRelativeRanks(int[] score) {
        int[] sortedScores = Arrays.copyOf(score,score.length);
        Arrays.sort(sortedScores);

        Map<Integer,String> relativeRanks = new HashMap<>();
        int k = 4;
        for (int i=sortedScores.length-1;i>-1;i--){
            if (i==sortedScores.length-1){
                relativeRanks.put(sortedScores[i],"Gold Medal");
            } else if (i==sortedScores.length-2){
                relativeRanks.put(sortedScores[i],"Silver Medal");
            } else if (i==sortedScores.length-3){
                relativeRanks.put(sortedScores[i],"Bronze Medal");
            } else {
                relativeRanks.put(sortedScores[i],k+"");
                k++;
            }
        }

        String[] result = new String[score.length];
        for (int i =0;i<score.length;i++){
            result[i] = relativeRanks.get(new Integer(score[i]));
        }

        return result;

    }

    public static void main(String[] args) {
//        int[] score = {5,4,3,2,1};
        int[] score = {10,3,8,9,4};
        System.out.println(Arrays.toString(findRelativeRanks(score)));
    }
}
