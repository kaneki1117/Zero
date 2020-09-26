package leetcode.nums121_150;

import q_util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Ques145 {

    public List<Integer> postorderTraversal(TreeNode root) {

        LinkedList<Integer> result = new LinkedList<>();
        if(root == null) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode t = stack.pop();
            result.addFirst(t.val);
            if(t.left != null) stack.push(t.left);
            if(t.right != null) stack.push(t.right);
        }

        return result;

    }
}
