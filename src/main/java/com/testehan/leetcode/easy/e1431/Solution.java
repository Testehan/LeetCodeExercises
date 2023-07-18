package com.testehan.leetcode.easy.e1431;

// 1431. Kids With the Greatest Number of Candies

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       int maxCandies = Arrays.stream(candies).max().getAsInt();

       List<Boolean> kidsThatCanHaveMaxCandies = new ArrayList<>();
       for (int i=0;i<candies.length;i++){
           if (candies[i]+extraCandies>=maxCandies){
               kidsThatCanHaveMaxCandies.add(true);
           } else{
               kidsThatCanHaveMaxCandies.add(false);
           }
       }

       return kidsThatCanHaveMaxCandies;

    }

    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;

        System.out.println(kidsWithCandies(candies,extraCandies));


    }
}
