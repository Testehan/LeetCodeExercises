package com.testehan.leetcode.easy.e232;

import java.util.Stack;

class MyQueue {

    private Stack<Integer> newestStack;
    private Stack<Integer> oldestStack;

    public MyQueue() {
        newestStack = new Stack<>();
        oldestStack = new Stack<>();
    }

    public void push(int x) {
        newestStack.push(x);
    }

    public int pop() {
        shiftStacks();
        return oldestStack.pop();
    }

    public int peek() {
        shiftStacks();
        return oldestStack.peek();
    }

    public boolean empty() {
        return oldestStack.isEmpty() && newestStack.empty();
    }

    public int remove() {
        shiftStacks();
        return oldestStack.pop();
    }

    private void shiftStacks() {
        if(oldestStack.isEmpty())
        {
            while (!newestStack.isEmpty()) {
                oldestStack.push(newestStack.pop());
            }
        }
    }
}
