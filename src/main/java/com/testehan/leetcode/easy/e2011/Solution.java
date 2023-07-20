package com.testehan.leetcode.easy.e2011;

// 2011. Final Value of Variable After Performing Operations

public class Solution {

    public static int finalValueAfterOperations(String[] operations) {
        String increment1 = "++X";
        String increment2 = "X++";

        String decrement1 = "--X";
        String decrement2 = "X--";

        int x = 0;

        for (int i=0; i<operations.length;i++){
            if (operations[i].equalsIgnoreCase(increment1) || operations[i].equalsIgnoreCase(increment2)){
                x++;
            } else {
                x--;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        String[] operations = {"--X","X++","X++"};

        System.out.println(finalValueAfterOperations(operations));
    }
}
