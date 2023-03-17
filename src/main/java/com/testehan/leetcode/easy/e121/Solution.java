package com.testehan.leetcode.easy.e121;

// 121. Best Time to Buy and Sell Stock

public class Solution {

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int min = prices[0];
        for (int i=1;i<prices.length;i++){
           if (min<prices[i]){
                maxProfit = prices[i]-min>maxProfit ? prices[i]-min : maxProfit;
           } else {
               min=prices[i];
           }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
