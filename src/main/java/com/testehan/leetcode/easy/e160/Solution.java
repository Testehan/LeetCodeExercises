package com.testehan.leetcode.easy.e160;

public class Solution {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        while (headA != null) {
            ListNode copyOfB = headB;
            while (headB != null) {
                if (headA == headB) {
                    return headA;
                } else {
                    headB = headB.next;
                }
            }
            headB = copyOfB;
            headA = headA.next;
        }

        return null;

    }

    public static void main(String[] args) {

    }
}
