package com.testehan.leetcode.easy.e168;

public class Solution {

    public static String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        while (columnNumber > 0){
            columnNumber --; // because first column is 1..and on the line from below if we add 1 to 'A' we get 'B' which is incorrect
            char c = (char) (columnNumber%26 + 'A');
            columnNumber = columnNumber / 26;
            result.append(c);
        }
        result.reverse();
        return result.toString();

    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(7098));

        System.out.println((char)('F'+10));
    }
}
