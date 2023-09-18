package com.testehan.leetcode.medium.m142;

// 142. Linked List Cycle II
// https://www.codingninjas.com/codestudio/library/floyds-cycle-finding-algorithm

public class Solution {

    public static ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        if (head==null || head.next == null) {
            return null;
        }
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast==slow){ // cycle detected
                break;
            }
        }

        // If the condition below is true it means we have no cycle
        if (fast == null || fast.next == null){
            return null;
        }

        while (head != slow) {
            head = head.next;   // moving head by 1...
            slow = slow.next;   // moving slow by 1 as well...
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(4);
        ListNode l4 = new ListNode(1);

        l1.next = l2;
        l2.next = l3;
        l3.next=l4;
        l4.next = l2;

//        print(l1);
        System.out.println(detectCycle(l1)!=null?detectCycle(l1).val:"null");

    }

    public static void print(ListNode node){
        while (node !=null){
            System.out.print(node.val + " ");
            node= node.next;
        }
        System.out.println(" ");
    }

}
