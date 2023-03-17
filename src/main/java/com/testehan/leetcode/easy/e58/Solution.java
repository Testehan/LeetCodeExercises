package com.testehan.leetcode.easy.e58;

// 58. Length of Last Word

public class Solution {
    public static int lengthOfLastWord(String s) {

        // var 3
        if(s.length()==1 && s.charAt(0)!=' '){
            return 1;
        }

        int n = s.length() - 1;
        for (int i = s.length()-1;i>=0;i--){
            if (s.charAt(i) == ' ') {
                if (n - i != 0 && s.charAt(i + 1) != ' ') {
                    return n - i;
                } else {
                    n = i - 1;
                }
            }
        }

        if(s.charAt(0)!=' '){

            return n+1;
        }

        return 0;

//        // var 2
//        String[] words = s.split(" ");
//        return words[words.length-1].length();


        // var 1
//        // eliminate all double or more consecutive spaces
//        while (s.indexOf("  ")>=0){
//            s = s.replace("  ", " ");
//        }
//        // eliminate last space
//        if (s.lastIndexOf(" ") == s.length()-1){
//            s = s.substring(0, s.length()-1);
//        }
//        return  s.substring(s.lastIndexOf(" ")+1).length();
    }


    public static void main(String[] args) {
        String s1 =  "Hello World";
        String s2 = "   fly me   to   the moon  ";
        String s3 = "luffy is still joyboy";

        System.out.println(lengthOfLastWord(s1));
        System.out.println(lengthOfLastWord(s2));
        System.out.println(lengthOfLastWord(s3));
    }
}
