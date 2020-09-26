package leetcode.nums91_120;

import q_util.TreeNode;

public class Ques114 {

    public static void main(String[] args) {

    }

    public void flatten(TreeNode root) {

        helper(root);

    }

    //flatten and return the last one
    private TreeNode helper(TreeNode root) {
        if ( root == null) return null;

        TreeNode leftLast = helper(root.left);
        TreeNode rightLast = helper(root.right);

        if (leftLast != null) {
            leftLast.right = root.right;
            root.right = root.left;
            root.left = null;
        }

        if (rightLast != null) {
            return rightLast;
        }
        if (leftLast != null) {
            return leftLast;
        }
        return root;
    }
}
