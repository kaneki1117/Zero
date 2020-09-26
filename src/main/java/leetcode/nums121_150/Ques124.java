package leetcode.nums121_150;

import q_util.TreeNode;
// 没有做出来 没有想好
public class Ques124 {

    int amount;


    public int maxPathSum(TreeNode root) {
        amount = Integer.MIN_VALUE;
        helper(root);
        return amount;
    }

    private int helper(TreeNode root) {
        if (root == null) return 0;

        int left = Math.max(helper(root.left), 0);
        int right = Math.max(helper(root.right), 0);

        amount = Math.max(amount, left + right + root.val);
        return Math.max(left, right) + root.val;
    }
}
