package com.testehan.leetcode.easy.e94;

// 94. Binary Tree Inorder Traversal

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {

    public static List<Integer> inorderTraversalRecursive(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inOrder(root,result);
        return result;
    }

    // recursive solution... maybe also look into a iterative solution
    private static void inOrder(TreeNode node, List<Integer> listOfValues){
        if (node != null){
            inOrder(node.left,listOfValues);
            listOfValues.add(node.val);
            inOrder(node.right,listOfValues);
        }
    }

    public static List<Integer> inorderTraversalIterative(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        Stack<TreeNode> orderedNodes = new Stack<>();
        TreeNode cur = root;
        while ((cur !=null) || (!orderedNodes.isEmpty())){
            while (cur != null){
                orderedNodes.push(cur);
                cur = cur.left;
            }

            cur = orderedNodes.pop();
            list.add(cur.val);
            cur = cur.right;
        }


//        Stack<TreeNode> stack = new Stack<>();
//        TreeNode cur = root;
//
//        while(cur!=null || !stack.empty()){
//            while(cur!=null){
//                stack.add(cur);
//                cur = cur.left;
//            }
//            cur = stack.pop();
//            list.add(cur.val);
//            cur = cur.right;
//        }

        return list;
    }

    public static void main(String[] args) {
        TreeNode node3 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2, node3, null);
        TreeNode node1 = new TreeNode(1, null, node2);

        System.out.println(inorderTraversalRecursive(node1));
        System.out.println(inorderTraversalIterative(node1));
    }
}
