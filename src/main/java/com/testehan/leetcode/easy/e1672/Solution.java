package com.testehan.leetcode.easy.e1672;

// 1672. Richest Customer Wealth

// matrix example
public class Solution {

    public static int maximumWealth(int[][] accounts) {
        int wealth=0;
        for (int i = 0; i<accounts.length;i++){
            int sum=0;
            for (int j=0;j<accounts[i].length;j++){
                sum=sum+accounts[i][j];
            }
            if (sum>wealth){
                wealth=sum;
            }
        }

        return wealth;
    }


    public static void main(String[] args) {
        int [][] matrix = {{1,2,3},{3,2,1}};

        System.out.println(maximumWealth(matrix));

    }
}
