package com.testehan.leetcode.easy.e101;

// 101. Symmetric Tree

//          1                   example of symetric tree...it would have been better to call it mirror tree..
//      2       2
//   3    4   4   3

public class Solution {

    public static boolean isSymmetric(TreeNode root) {
        return root==null || isSymmetricHelp(root.left, root.right);
    }

    private static boolean isSymmetricHelp(TreeNode left, TreeNode right){
        if(left==null || right==null)
            return left==right; // if both are null return true..if just one is null then return false cause that means no symetry
        if(left.val!=right.val)
            return false;       // if values don't match, return false

        // we call this because if you look at the example of a  tree from above the class name, we need to compare
        // the left most node with the right most, then the left interior node with the right interior (left) node..
        // and this is done recursively..
        return isSymmetricHelp(left.left, right.right) && isSymmetricHelp(left.right, right.left);
    }

    public static void main(String[] args) {
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n1 = new TreeNode(1,n2,n3);

        TreeNode n22 = new TreeNode(2);
        TreeNode n32 = new TreeNode(2);
        TreeNode n12 = new TreeNode(1,n22,n32);

        System.out.println(isSymmetric(n1));
        System.out.println(isSymmetric(n12));

    }

}
