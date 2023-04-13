package com.testehan.leetcode.easy.e228;

// 228. Summary Ranges

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static List<String> summaryRanges(int[] nums) {

        String to = "->";
        List<String> ranges = new ArrayList<>();

        StringBuilder sb = new StringBuilder();
        boolean addedFirst = false;
        boolean addedSecond = false;
        int first = 0;
        int i =0;
       while(i<nums.length){
            if (!addedFirst){
                sb.append(nums[i]);
                addedFirst = true;
                first = nums[i];
                i++;
            } else {
                if (nums[i]-1==first){
                    first=nums[i];
                    addedSecond = true;
                    i++;
                } else {
                    if (addedFirst && addedSecond){
                        sb.append(to);
                        sb.append(nums[i-1]);
                        ranges.add(sb.toString());
                        addedSecond = false;
                    } else {
                        ranges.add(sb.toString());
                    }
                    sb = new StringBuilder();
                    addedFirst = false;
                }
            }

       }
       if (addedFirst) {
           if (addedSecond){
               sb.append(to);
               sb.append(first);
           }
           ranges.add(sb.toString());
       }

        return ranges;

    }

    public static void main(String[] args) {
//        int[] numbers = {0,1,2,4,5,7};
        int [] numbers = {0,2,3,4,6,8,9};
        System.out.println(summaryRanges(numbers));
    }
}
