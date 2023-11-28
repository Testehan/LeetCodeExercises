package com.testehan.leetcode.medium.m739;

// 739. Daily Temperatures

import java.util.Arrays;
import java.util.Stack;

public class Solution {

    // got this approach from the solutions tab...and it is more time efficient than the one from below
    public static int[] dailyTemperatures2(int[] temperatures) {
        Stack<Integer> stack = new Stack();
        int temperaturesSize = temperatures.length;
        int answer[] = new int[temperaturesSize];

        for(int i=0;i<temperaturesSize;i++)
        {
            // when we find a temperature higher than the one represented by the position in the stack, then we
            // will handle all positions in the stack that are covered by this newer higher temperature discovered.
            while(stack.size()>0 && temperatures[i]>temperatures[stack.peek()])
                answer[stack.peek()]=i-stack.pop();

            //
            stack.push(i);
        }
        return answer;
    }

    // does not work on 1 test case, because it exceeds the time limit
    public static int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];

        for (int i=0;i<temperatures.length;i++){
            int positions = 1;
            boolean found = false;
            for (int j=i+1;j<temperatures.length &&  !found;j++){
                if (temperatures[j]>temperatures[i]){
                    found = true;
                    break;
                }
                positions++;
            }
            if (found){
                answer[i]=positions;
            }
        }

        return answer;

    }

    public static void main(String[] args){
        int[] temperatures = {73,74,75,71,69,72,76,73};
//        int[] temperatures = {30,40,50,60};

        System.out.println(Arrays.toString(dailyTemperatures2(temperatures)));
    }
}
