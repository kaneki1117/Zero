package leetcode.nums91_120;

import q_util.TreeNode;

public class Ques110 {

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;

        ResultType resultType = helper(root);

        return resultType.isBalance();


    }



    public ResultType helper (TreeNode t) {

        if ( t == null) {
            return new ResultType(0, true);
        }

        if (t.left == null && t.right == null) {
            return new ResultType(1, true);
        }

        ResultType left = helper(t.left);
        ResultType right = helper(t.right);

        boolean gap = Math.abs(left.depth - right.depth) > 1 ? false : true;

        boolean res = left.isBalance && right.isBalance && gap;

        return new ResultType(1 + Math.max(left.depth, right.depth), res);


    }

    class ResultType {
        int depth;
        boolean isBalance;

        public ResultType(int depth, boolean isBalance) {
            this.depth = depth;
            this.isBalance = isBalance;
        }

        public int getDepth() {
            return depth;
        }

        public void setDepth(int depth) {
            this.depth = depth;
        }

        public boolean isBalance() {
            return isBalance;
        }

        public void setBalance(boolean balance) {
            isBalance = balance;
        }
    }

}


