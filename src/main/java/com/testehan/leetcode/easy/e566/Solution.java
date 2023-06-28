package com.testehan.leetcode.easy.e566;

// 566. Reshape the Matrix

import java.util.Arrays;

public class Solution {

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        if (r*c != mat.length*mat[0].length) {
            return mat;
        }

        int[] temp = new int[r*c];
        int k=0;
        for (int i =0;i<mat.length;i++){
            for (int j=0;j<mat[i].length;j++){
                temp[k]=mat[i][j];
                k++;
            }
        }

        int[][] result = new int[r][c];
        k=0;
        for (int i=0;i<r;i++){
            for (int j =0;j<c;j++){
                result[i][j] = temp[k];
                k++;
            }
        }

        return result;
    }


    public static void main(String[] args) {
        int[][] mat = {{1,2},{3,4}};
        int  r = 1, c = 4;

        int[][] result = matrixReshape(mat,r,c);
        for (int i = 0;i<result.length;i++){
            System.out.println(Arrays.toString(result[i]));
        }

    }
}
