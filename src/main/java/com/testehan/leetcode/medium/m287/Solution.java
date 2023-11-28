package com.testehan.leetcode.medium.m287;

// 287. Find the Duplicate Number

public class Solution {

    // rabbit and hare... since we know that nums has a length and the numbers from it are smaller than
    // length, we can use the values from nums as indexes for the next number..
    public static int findDuplicate(int[] nums) {
        int slow =0, fast =0;
        int result = 0;

        // Step 1
        // Cycle detection
        while(true){
            slow = nums[slow];
            fast = nums[nums[fast]];

            if (slow==fast){ // it means that the different pointers/indexes slow and fast point that brought us to
                break;      // the current value, are the ones that are the duplicates..
            }
        }

        // Step 2
        // Locate the start node of cycle (i.e., the duplicate number)
        while( true ){
            slow = nums[slow];
            result = nums[result];

            if( slow == result ){
                break;
            }
        }

        return result;
    }

// does not work if the problem suggests that we can have the repeating number appearing more than once
//    public static int findDuplicate(int[] nums) {
//        int sum = 0;
//        for (int number:nums){
//            sum = sum+number;
//        }
//        int sumOfFirstN = (nums.length-1)*(nums.length)/2;
//        System.out.println(sum);
//        System.out.println(sumOfFirstN);
//        if (sum-sumOfFirstN==0){
//            return nums[0];
//        }
//        return sum - sumOfFirstN;
//    }

    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
//        int[] nums = {2,2,2,2,2};
        System.out.println(findDuplicate(nums));
    }

}
