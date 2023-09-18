package com.testehan.leetcode.medium.m86;

// 86. Partition List

public class Solution {

    public static ListNode partition(ListNode head, int x) {

        if (head==null || head.next ==null){
            return head;
        }

        ListNode current = head;

        int size = 1;
        ListNode before = new ListNode(-10000);
        ListNode copyBefore = before;
        ListNode after = new ListNode(-10000);
        ListNode copyAfter = after;

        while (current !=null){
            if (current.val < x){
                before.next = new ListNode(current.val);
                before = before.next;
            } else {
                after.next= new ListNode(current.val);
                after = after.next;
            }
            current= current.next;
            size++;
        }
        before.next = copyAfter.next;

        return copyBefore.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(6, new ListNode(2,new ListNode(3)))));

        print(partition(l1,3));
    }

    public static void print(ListNode node){
        while (node !=null){
            System.out.print(node.val + " ");
            node= node.next;
        }
    }
}
