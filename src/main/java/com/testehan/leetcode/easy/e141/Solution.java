package com.testehan.leetcode.easy.e141;

// 141. Linked List Cycle

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static boolean hasCycle(ListNode head) {
        Set<ListNode> setOfNodes = new HashSet<>();

        while (head!=null){
            if (!setOfNodes.add(head)){
                return true;
            }
            head=head.next;
        }

        return false;
    }

    public static void main(String[] args) {

    }
}
