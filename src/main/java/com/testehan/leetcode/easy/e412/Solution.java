package com.testehan.leetcode.easy.e412;

// 412. Fizz Buzz

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static List<String> fizzBuzz(int n) {
        List<String> results = new ArrayList<>();

        for (int i =1; i<= n ; i++){
            if (i%15==0){
                results.add("FizzBuzz");
                continue;
            }
            if (i%5==0){
                results.add("Buzz");
                continue;
            }
            if (i%3==0){
                results.add("Fizz");
                continue;
            }
            results.add(i+"");

        }
        return results;
    }

    public static void main(String[] args) {

        System.out.println(fizzBuzz(23));

    }
}
