package lintcode.q_easy;

import q_util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Ques66 {

    public List<Integer> preorderTraversal(TreeNode root) {
        // write your code here
        List<Integer> res = new ArrayList<>();
        if(root == null) return null;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.empty()){
            TreeNode node = stack.pop();
            res.add(node.val);
            if(node.right !=null) stack.push(node.right);
            if(node.left !=null) stack.push(node.left);
        }
        return res;

    }

    public static void main(String[] args) {

    }
}
