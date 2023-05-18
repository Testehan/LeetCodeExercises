package com.testehan.leetcode.easy.e100;

// 100. Same Tree

public class Solution {

    // recursion method
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        // means we are at an end of the tree
        if (p == null && q == null) {
            return true;
        }
        // means that the structure of the trees is different because of nodes missing
        if (p == null && q != null || p != null && q == null){
            return false;
        }

        // means that the structure is different because of different value
        if (p.val != q.val){
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n1 = new TreeNode(1,n2,n3);

        TreeNode n22 = new TreeNode(2);
        TreeNode n32 = new TreeNode(3);
        TreeNode n12 = new TreeNode(1,n22,n32);

        System.out.println(isSameTree(n1,n12));

    }
}
