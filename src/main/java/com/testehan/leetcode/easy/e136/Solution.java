package com.testehan.leetcode.easy.e136;

public class Solution {

    public static int singleNumber(int[] nums) {
        // XOR bitwise operator
        // The XOR operator compares each binary digit of two integers and gives back 1 if both the compared bits are
        // different. This means that if bits of both the integers are 1 or 0 the result will be 0; otherwise,
        // the result will be 1:
        // In other words, if two integers of the same value (and bit representation) are XORed together, the
        // expression evaluates to all 0s. If a number is XORed with all 0s, the expression evaluates to the number
        // itself. These are both properties of the XOR function.
        // the rationale is that A^A =0, and A^B^A=B. So if all the number are repeated twice, all the repeated
        // numbers will result in 0 and the only number that is not repeated will be in the result.


                int result = 0;
                for(int i : nums) {
                    result ^= i;
                }
                return result;



        // my solution
//        Map<Integer,Integer> appearances = new HashMap<>();
//        for (int i=0;i<nums.length;i++){
//            int currentAppearances = appearances.get(nums[i]) == null ? 0 : appearances.get(nums[i]);
//            int noOfAppearances = currentAppearances + 1;
//            if (noOfAppearances>1){
//                appearances.remove(nums[i]);
//            } else {
//                appearances.put(nums[i], noOfAppearances);
//            }
//        }
//
//        return (int)appearances.keySet().toArray()[0];

    }

    public static void main(String[] args) {
        int[] numbers = {4,1,2,1,2};
        System.out.println(singleNumber(numbers));
    }
}
