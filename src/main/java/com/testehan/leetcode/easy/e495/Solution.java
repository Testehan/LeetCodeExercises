package com.testehan.leetcode.easy.e495;

// 495. Teemo Attacking

public class Solution {

    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        int poisonDuration = 0;
        for (int i=0;i<timeSeries.length-1;i++){
            if (timeSeries[i]+duration-1<timeSeries[i+1]){
                poisonDuration = poisonDuration + duration;
            } else {
                poisonDuration = poisonDuration + timeSeries[i+1]-timeSeries[i];
            }
        }
        poisonDuration = poisonDuration + duration;

        return poisonDuration;
    }

    public static void main(String[] args) {
//        int[] timeSeries = {1,4};   // 4
        int[] timeSeries = {1,2};   // 3
        int duration = 2;

        System.out.println(findPoisonedDuration(timeSeries,duration));
    }
}
