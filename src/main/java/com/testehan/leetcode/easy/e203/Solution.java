package com.testehan.leetcode.easy.e203;

// 203. Remove Linked List Elements

public class Solution {

    public static ListNode removeElements(ListNode head, int val) {
       ListNode fake = new ListNode(-1);
        fake.next = head;
        ListNode curr = head, prev = fake;

       while (curr != null){
           if (curr.val == val){
               prev.next = curr.next;
           } else{
               prev = prev.next;
           }
           curr = curr.next;

       }
       return fake.next;
    }

    public static void print(ListNode node){
        while (node !=null){
            System.out.print(node.val + " ");
            node= node.next;
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(6)));

        print(removeElements(l1,1));
    }


}
