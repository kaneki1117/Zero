package leetcode.nums91_120;

import q_util.TreeNode;

public class Ques112 {

    public boolean hasPathSum(TreeNode root, int sum) {
        if ( root == null) return false;

        if (root.left == null && root.right == null && sum == root.val) {
            return true;
        }

        boolean left = hasPathSum(root.left , sum - root.val);
        boolean right = hasPathSum(root.right , sum - root.val);

        return left || right;
    }
}
