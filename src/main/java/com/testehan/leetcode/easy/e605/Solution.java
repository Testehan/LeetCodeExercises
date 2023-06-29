package com.testehan.leetcode.easy.e605;

// 605. Can Place Flowers

public class Solution {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) {
            return true;
        }

        for (int i = 0; i<flowerbed.length;i++){
            if (flowerbed[i] == 0 && (i==0 || flowerbed[i-1]==0) && (i==flowerbed.length-1 || flowerbed[i+1] == 0)){
                n--;
                flowerbed[i]=1;
                if (n == 0) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        //int[] flowerbed = {1,0,0,0,1};
       // int n = 1;        -> true

        int[] flowerbed = {1,0,0,0,1};
        int n = 2;

        System.out.println(canPlaceFlowers(flowerbed,n));
    }
}
