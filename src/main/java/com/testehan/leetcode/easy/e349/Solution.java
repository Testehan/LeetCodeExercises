package com.testehan.leetcode.easy.e349;

// 349. Intersection of Two Arrays

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> numbers1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> intersection = new HashSet<>();

        for (int n :nums2){
            if (numbers1.contains(n)){
                intersection.add(n);
            }
        }

        int[] intersect = new int[intersection.size()];
        int i =0;
        for (Integer number:intersection){
            intersect[i] = number;
            i++;
        }

        return intersect;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        System.out.println(Arrays.toString(intersection(nums1,nums2)));
    }
}
