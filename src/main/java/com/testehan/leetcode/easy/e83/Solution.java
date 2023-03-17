package com.testehan.leetcode.easy.e83;

public class Solution {

    public static ListNode deleteDuplicates(ListNode head) {
        if ((head == null) || (head.next == null)){
            return head;
        }

        ListNode current = head;
        do{
            if (current.val == current.next.val){
                if (current.next.next != null) {
                    current.next = current.next.next;
                } else {
                    current.next = null;
                }
            } else {
                current = current.next;
            }

        } while (current!=null && current.next != null);

        return head;
    }


    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(1, new ListNode(1)));

        ListNode result = deleteDuplicates(l1);
        boolean hasNext = true;
        while (hasNext){
            System.out.print(result.val+" ");
            result = result.next;
            if (result.next == null){
                hasNext = false;
                System.out.print(result.val+" ");
            }
        }
    }
}
