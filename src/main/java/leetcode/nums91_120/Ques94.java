package leetcode.nums91_120;

import q_util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Ques94 {


    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Stack<TreeNode> stack = new Stack<>();

        while (root != null || stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            result.add(root.val);
            root = root.right;

        }

        return result;


    }
}
