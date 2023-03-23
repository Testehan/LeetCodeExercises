package com.testehan.leetcode.easy.e20;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

// 20. Valid Parentheses

public class Solution {

    public boolean isValid(String s) {
        Map<Character,Integer> open = new HashMap<>();
        open.put('(', 0);
        open.put('{', 0);
        open.put('[', 0);
        Stack<Character> stk = new Stack<>();

        char[] chars = s.toCharArray();
        for (int i=0;i<chars.length;i++){
            if (isOpen(chars[i])){
                open.put(chars[i],open.get(chars[i])+1);

                stk.push(chars[i]);
            } else {
                char oppo = getOposingChar(chars[i]);
                char last;
                if (!stk.empty()){
                    last = stk.pop();
                } else {
                    return false;
                }
                if (oppo != last){
                    return false;
                }
                int correctness = open.get(oppo);
                if (correctness-1>=0){
                    open.put(oppo,correctness-1);
                } else {
                    // means we are closing a paranthesses without open so INVALID string
                    return false;
                }
            }
        }
        return (open.get('(') ==0 && open.get('[') ==0 && open.get('{') ==0);
    }

    private boolean isOpen(char c){
        return (c == '(' || c == '{' || c == '[' );
    }


    private char getOposingChar(char c){
        switch(c) {
            case '(':
                return ')';
            case ')': return '(';
            case '[': return ']';
            case ']': return '[';
            case '{': return '}';
            case '}': return '{';
            default :
                throw new IllegalArgumentException();
        }
    }

}
