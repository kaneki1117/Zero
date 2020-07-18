package lintcode.q_easy;

import q_util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Ques67 {

    public static void main(String[] args) {

    }

    public List<Integer> postorderTraversal(TreeNode root) {
        // write your code here
        if(root ==null) return null;
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        while (!stack.empty() || root!= null){
            while (root != null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            res.add(root.val);
            root = root.right;
        }

        return res;
    }
}
