package com.testehan.leetcode.medium.m19;

// 19. Remove Nth Node From End of List

public class Solution {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode previous = new ListNode(-1,head);

        int nrElements = 1;
        while (previous.next.next!=null){
            nrElements++;
            previous = previous.next;
        }
        System.out.println(nrElements);

        if (n==nrElements){
            head = head.next;
        } else {
            if (n==1) {
                previous.next = null;
            } else{
                ListNode current = head;
                for (int i = 1; i < nrElements - n; i++) {
                    current = current.next;
                }
                current.next = current.next.next;
            }
        }

        return head;
    }


    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(6)));

        print(removeNthFromEnd(l1,3));
    }

    public static void print(ListNode node){
        while (node !=null){
            System.out.print(node.val + " ");
            node= node.next;
        }
    }

}
