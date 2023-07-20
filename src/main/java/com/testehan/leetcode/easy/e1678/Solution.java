package com.testehan.leetcode.easy.e1678;

// 1678. Goal Parser Interpretation

public class Solution {

    public String interpret(String command) {
        return command.replace("()","o").replace("(al)","al");
    }

}
