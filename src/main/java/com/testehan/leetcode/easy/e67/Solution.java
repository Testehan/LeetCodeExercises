package com.testehan.leetcode.easy.e67;

//67. Add Binary

public class Solution {
    public static String addBinary(String a, String b) {
        if (a.length()>b.length()){
            b = addLeadingZeros(a, b);
        } else {
            a = addLeadingZeros(b,a);
        }
        StringBuilder sb = new StringBuilder(a.length());
        int reminder = 0;
        for (int i =a.length()-1; i>-1;i--){
            int charA = Character.getNumericValue(a.charAt(i));
            int charb = Character.getNumericValue(b.charAt(i));

            int total = charA + charb + reminder;
            sb.append(total % 2);
            if (total > 1){
                reminder = 1;
            } else {
                reminder=0;
            }
        }

        if (reminder==1){
            sb.append(1);
        }

        return sb.reverse().toString();

    }

    private static String addLeadingZeros(String a, String b) {
        int difference = a.length()- b.length();
        StringBuilder sb = new StringBuilder();
        for (int i =0;i<difference;i++){
            sb.append("0");
        }
        sb.append(b);
        return sb.toString();
    }

    public static void main(String[] args) {
        String s1 = "11";
        String s2 = "1";

        String a = "1111";
        String b= "1111";

        System.out.println(addBinary(s1,s2));
        System.out.println(addBinary(a,b));
    }
}
