package com.testehan.leetcode.easy.e1108;

// 1108. Defanging an IP Address

public class Solution {

    public static String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }

    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
    }

}
