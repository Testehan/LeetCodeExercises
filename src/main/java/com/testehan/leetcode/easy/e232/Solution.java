package com.testehan.leetcode.easy.e232;

// 232. Implement Queue using Stacks

public class Solution {

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1); // queue is: [1]
        myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
        System.out.println(myQueue.peek()); // return 1
        System.out.println(myQueue.pop()); // return 1, queue is [2]
        myQueue.push(3); // queue is: [2,3] (leftmost is front of the queue)
        System.out.println(myQueue.pop()); // return 2, queue is [3]
        System.out.println(myQueue.empty()); // return false
    }
}
