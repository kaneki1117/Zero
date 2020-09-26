package leetcode.nums91_120;

import q_util.TreeNode;

//未AC；  没有注意到 右节点的左节点的值 是需要大于根节点这一特性
public class Ques98 {

    public boolean isValidBST(TreeNode root) {

        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);

    }

    private boolean isValidBST(TreeNode root, long minValue, long maxValue) {

        if (root == null ) return true;


        if ( root.val <= minValue || root.val >= maxValue) return false;

        return isValidBST(root.left,  minValue , root.val) && isValidBST(root.right, root.val , maxValue);
    }
}
