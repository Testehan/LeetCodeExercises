package com.testehan.leetcode.easy.e2114;

// 2114. Maximum Number of Words Found in Sentences

public class Solution {

    public static int mostWordsFound(String[] sentences) {
        int max = -1;
        for (int i =0; i<sentences.length;i++){
            int noWords = sentences[i].split(" ").length;
            if (noWords >= max){
                max = noWords;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        String[] sentences =  {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};

        System.out.println(mostWordsFound(sentences));
    }
}
