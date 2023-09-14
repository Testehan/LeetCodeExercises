package com.testehan.leetcode.easy.e746;

// 746. Min Cost Climbing Stairs

public class Solution {

    // this solution modifies the array. since it was no requirement to keep it intact, i guess this is fine...
    // next, what we do is assign the minimum latest cost needed to reach each stair, adding the current stair cost as
    // well...in the end, the right answer will be in the minimum between the last 2 elements..
    public static int minCostClimbingStairs(int[] cost) {
       for (int i=2;i<cost.length;i++){
           cost[i] = Math.min(cost[i-1],cost[i-2])+cost[i];
       }

       return Math.min(cost[cost.length-1],cost[cost.length-2]);
    }

    public static void main(String[] args) {
//        int[] cost = {10,15,20};
        int[] cost = {1,100,1,1,1,100,1,1,100,1};

        System.out.println(minCostClimbingStairs(cost));
    }
}
