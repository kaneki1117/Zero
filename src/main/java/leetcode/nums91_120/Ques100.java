package leetcode.nums91_120;

import q_util.TreeNode;

public class Ques100 {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null ) return q == null;
        if (q == null) return false;

        if (p.val == q.val) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }

        return false;
    }

    public static void main(String[] args) {

    }
}
