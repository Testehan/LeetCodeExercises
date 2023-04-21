package com.testehan.leetcode.easy.e234;

import java.util.Stack;

// 234. Palindrome Linked List

public class Solution {

    public static boolean isPalindrome(ListNode head) {
        ListNode current = head;

        int size = 0;
        while (current!=null){
            current = current.next;
            size++;
        }

        Stack<Integer> firstNumbers = new Stack<>();
        boolean isNumberEven = size % 2 ==0;

        current = head;
        int i = 1;
        while (current!=null){
            if (i <= size/2) {
                firstNumbers.push(current.val);
            } else {

                if (i==(size/2+1) && !isNumberEven){
                    firstNumbers.push(current.val); // add the number from the odd position in the center
                }

                if (i>size/2){
                    if (current.val != firstNumbers.pop()) {
                        return false;
                    }
                }
            }
            i++;
            current = current.next;
        }

        return true;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));

        print(l1);

        System.out.println("Is list palindom ? Answer is: " + isPalindrome(l1));
    }

    public static void print(ListNode node){
        while (node !=null){
            System.out.print(node.val + " ");
            node= node.next;
        }
    }
}
