package com.testehan.leetcode.easy.e206;

// 206. Reverse Linked List

public class Solution {

    public static ListNode reverseList(ListNode head) {

        if (head != null) {
            ListNode reversed = new ListNode(head.val, null);
            head = head.next;
            ListNode current;
            while (head != null) {
                current = new ListNode(head.val, head.next);
                current.next = reversed;
                reversed = current;
                head = head.next;
            }
            return  reversed;
        } else {
            return null;
        }
    }

    public static void print(ListNode node){
        while (node !=null){
            System.out.print(node.val + " ");
            node= node.next;
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(6)));

        print(reverseList(l1));
    }
}
