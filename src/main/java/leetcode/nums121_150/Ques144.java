package leetcode.nums121_150;

import q_util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Ques144 {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode t = stack.pop();
            result.add(t.val);
            if(t.right != null) stack.push(t.right);
            if(t.left != null) stack.push(t.left);
        }

        return result;
    }
}
