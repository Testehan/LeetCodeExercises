package com.testehan.leetcode.easy.e599;

// 599. Minimum Index Sum of Two Lists

import java.util.*;

public class Solution {

    // first approach
//    public static String[] findRestaurant(String[] list1, String[] list2) {
//        ArrayList<String> result = new ArrayList<>();
//        int minIndexSum = 2001;
//        for (int i=0;i<list1.length; i++){
//            for (int j=0;j<list2.length; j++){
//                if (list1[i].equals(list2[j])){
//                    if (i+j==minIndexSum){
//                        result.add(list1[i]);
//                    }
//                    if (i+j<minIndexSum){
//                        result.clear();
//                        result.add(list1[i]);
//                        minIndexSum = i+j;
//                    }
//                }
//            }
//        }
//
//        String[] myArray = new String[result.size()];
//        result.toArray(myArray);
//        return myArray;
//    }

    // second approach
    public static String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        List<String> res = new LinkedList<>();
        int minIndexSum = 2001;

        for (int i=0;i<list1.length;i++) {
            map.put(list1[i], i);
        }

        for (int i=0;i<list2.length;i++) {
            Integer j = map.get(list2[i]);
            if (j != null && i + j <= minIndexSum) {
                if (i + j < minIndexSum) {
                    res.clear(); minIndexSum = i+j;
                }
                res.add(list2[i]);
            }
        }
        return res.toArray(new String[res.size()]);
    }

    public static void main(String[] args) {
//        String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list1 = {"happy","sad","good"};
//        String[] list2 = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
        String[] list2 = {"sad","happy","good"};

        String[] result = findRestaurant(list1,list2);
        System.out.println(Arrays.toString(result));
    }
}
