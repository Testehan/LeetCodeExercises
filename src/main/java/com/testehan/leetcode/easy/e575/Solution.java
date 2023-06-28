package com.testehan.leetcode.easy.e575;

// 575. Distribute Candies

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static int distributeCandies(int[] candyType) {
        Set<Integer> disctinctCandies = new HashSet<>();
        for (int i : candyType){
            disctinctCandies.add(i);
        }

        int max= candyType.length/2;
        if (max >= disctinctCandies.size()){
            return  disctinctCandies.size();
        } else {
            return max;
        }
    }

    public static void main(String[] args) {
//        int[] candyType = {1,1,2,2,3,3};
//        int[] candyType = {1,1,2,3};
        int[] candyType = {6,6,6,6};

        System.out.println(distributeCandies(candyType));
    }
}
