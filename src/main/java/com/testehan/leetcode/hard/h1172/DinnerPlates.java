package com.testehan.leetcode.hard.h1172;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.TreeSet;

public class DinnerPlates {

    private final int maximumStackCapacity;
    private List<Stack<Integer>> stacks; // ArrayList of stacks of plates
    private TreeSet<Integer> availableStack; // Track of the ordered indices of stacks with available space to push new element


    public DinnerPlates(int capacity) {
        this.maximumStackCapacity = capacity;
        this.stacks = new ArrayList<>();
        this.availableStack = new TreeSet<>();

    }

    public void push(int val) {
        if (availableStack.isEmpty()) {
            stacks.add(new Stack<>());
            availableStack.add(stacks.size() - 1);
        }

        // Gets the smallest value from the treeset which will be the index
        // of the first stack with space to push a value
        Stack<Integer> firstStackWithSpace = stacks.get(availableStack.first());
        firstStackWithSpace.push(val);

        // If this firstStackWithSpace reaches max capacity, remove the index from treemap
        if (firstStackWithSpace.size() == maximumStackCapacity) {
            availableStack.pollFirst(); // Remove the smallest value (index of stack)
        }
    }

    public int pop() {
        if (stacks.isEmpty()) {
            return -1;
        }

        int val = stacks.get(stacks.size() - 1).pop(); // Pop from the last stack in the list of stacks

        // Since we removed at least 1 element from this last stack, let's add its index to availableStack
        availableStack.add(stacks.size() - 1);

        // Once we remove an element from the last stack, we need to check if that stack is empty or not,
        // and if empty, we need to remove the empty stacks
        while (!stacks.isEmpty() && stacks.get(stacks.size() - 1).isEmpty()) {
            stacks.remove(stacks.size() - 1); // Remove the stack from the list of stacks

            // Since we removed the element from the last index, and that was in availableStack
            // as a stack which has space to push more elements, it would have been the highest
            // value in the TreeSet, since data stays as sorted in TreeSet. So we can use pollLast()
            // to remove the last (or rather highest value) index now, since we also removed that
            // empty stack from the list of stacks
            availableStack.pollLast();
        }

        return val;
    }

    public int popAtStack(int index) {
        if (index >= stacks.size()) {
            return -1; // Invalid stack index
        }
        if (index == stacks.size() - 1) { // Basically the last stack
            return pop();
        }

        // If it's any index other than the last stack, then...
        Stack<Integer> requiredStack = stacks.get(index);
        int val = requiredStack.isEmpty() ? -1 : requiredStack.pop();
        availableStack.add(index); // Since we removed an element, it frees up a space in that stack

        return val;
    }

}
