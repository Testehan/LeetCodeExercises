package com.testehan.leetcode.easy.e500;

// 500. Keyboard Row

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static String[] findWords(String[] words) {
        final String firstRow = "qwertyuiop";
        final String secondRow = "asdfghjkl";
        final String thirdRow = "zxcvbnm";

        List<String> result = new ArrayList<>();

        for (String word : words){

            String currentRow=null;
            if (firstRow.indexOf(word.toLowerCase().charAt(0))>-1){
                currentRow = firstRow;
            }
            if (secondRow.indexOf(word.toLowerCase().charAt(0))>-1){
                currentRow = secondRow;
            }
            if (thirdRow.indexOf(word.toLowerCase().charAt(0))>-1){
                currentRow = thirdRow;
            }

            boolean isWorkCorrect = true;
            for (int i=0;i<word.length();i++){
                if (currentRow.indexOf(word.toLowerCase().charAt(i))==-1){
                    isWorkCorrect = false;
                }
            }

            if (isWorkCorrect){
                result.add(word);
            }
        }
        return result.toArray(new String[result.size()]);
    }

    public static void main(String[] args) {
        String[]  words = {"Hello","Alaska","Dad","Peace"};

        System.out.println(Arrays.toString(findWords(words)));
    }

}
