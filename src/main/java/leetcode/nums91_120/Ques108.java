package leetcode.nums91_120;

import q_util.TreeNode;

public class Ques108 {

    public static void main(String[] args) {

    }


    public TreeNode sortedArrayToBST(int[] nums) {

        if (nums == null || nums.length == 0) return null;

        return helper(nums, 0 , nums.length - 1);

    }

    private TreeNode helper(int[] nums, int left, int right) {
        if (left > right) return null;

        int mid = (right - left) / 2  + left;

        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums, left , mid - 1);
        root.right = helper(nums, mid + 1, right);

        return root;
    }


}
