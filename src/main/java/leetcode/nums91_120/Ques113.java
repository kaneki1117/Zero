package leetcode.nums91_120;

import q_util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Ques113 {

    public List<List<Integer>> pathSum(TreeNode root, int sum) {

        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;


        helper(root, sum, new ArrayList<>(), result);
        return result;
    }

    private void helper(TreeNode root, int val, List<Integer> list, List<List<Integer>> result) {

        if (root == null) return;

        list.add(root.val);

        if (root.left == null && root.right == null && root.val == val) {
            result.add(new ArrayList<>(list));
            return;
        }

        if (root.left != null) {
            helper(root.left, val - root.val , list, result);
            list.remove(list.size()-1);
        }

        if (root.right != null) {
            helper(root.right, val - root.val , list, result);
            list.remove(list.size()-1);
        }

    }
}
