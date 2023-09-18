package com.testehan.leetcode.medium.m48;

// 48. Rotate Image       by 90 degrees to the right

public class Solution {

    // basically the first column of the matrix, after being rotated will become the first row...2 column will become
    // 2 row and so on..
    public static boolean rotate(int[][] matrix) {
        if (matrix.length == 0 || matrix.length!=matrix[0].length){ // if we don't have NxN matrix
            return false;
        }

        int n = matrix.length;
        for (int layer =0; layer<n/2 ; layer++){
            int first = layer;
            int last = n - 1 - layer;
            for (int i = first; i<last; i++){
                int offset = i-first;

                int top = matrix[first][i];
                matrix[first][i] = matrix[last-offset][first];
                matrix[last-offset][first] = matrix[last][last-offset];
                matrix[last][last-offset] = matrix[i][last];
                matrix[i][last] = top;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int [][] matrix = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        print(matrix);
        System.out.println("Rotating");
        rotate(matrix);

        print(matrix);
    }

    private static void print(int[][] matix){
        for (int i =0;i<matix.length;i++){
            for (int j=0;j<matix.length;j++){
                System.out.print(matix[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
