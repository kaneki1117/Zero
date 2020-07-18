package lintcode.q_easy;

import q_util.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Ques68 {

    public List<Integer> postorderTraversal(TreeNode root) {
        // write your code here
        if(root == null) return null;

        Stack<TreeNode> stack = new Stack<>();
        List<Integer> res = new ArrayList<>();
        stack.push(root);
        while (!stack.empty()){
            TreeNode temp = stack.pop();
            res.add(temp.val);
            if(temp.left != null){
                stack.push(temp.left);
            }
            if(temp.right != null){
                stack.push(temp.right);
            }
        }
        Collections.reverse(res);
        return res;


    }
}
