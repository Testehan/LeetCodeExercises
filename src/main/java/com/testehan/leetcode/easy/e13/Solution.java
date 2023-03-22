package com.testehan.leetcode.easy.e13;

// 13. Roman to Integer

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int romanToInt(String s) {
        int sum = 0;
        int i = 0;
        Map<Character,Integer> romanToInts = new HashMap();
        romanToInts.put('I',1);
        romanToInts.put('V',5);
        romanToInts.put('X',10);
        romanToInts.put('L',50);
        romanToInts.put('C',100);
        romanToInts.put('D',500);
        romanToInts.put('M',1000);

        while (i < s.length()){
            char c = s.charAt(i);
            if (((c == 'I') || (c == 'X') || (c == 'C')) && (i <= s.length()-2)){
                char next = s.charAt(i+1);
                if (romanToInts.get(c) < romanToInts.get(next)){
                    System.out.println("before I" + sum);
                    sum = sum + romanToInts.get(next)-romanToInts.get(c);
                    System.out.println("after I" + sum);
                    i = i+2;
                } else {
                    sum = sum + romanToInts.get(c);
                    System.out.println("else i= " + i + " sum=" + sum );
                    i = i+1;
                }


            } else {
                sum = sum + romanToInts.get(c);
                System.out.println("else i= " + i + " sum=" + sum );
                i = i+1;
            }

            System.out.println("sum =" + sum);
        }

        return sum;
    }

}
