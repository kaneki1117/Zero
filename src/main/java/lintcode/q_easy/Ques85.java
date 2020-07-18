package lintcode.q_easy;

import q_util.TreeNode;

public class Ques85 {
    public TreeNode insertNode(TreeNode root, TreeNode node) {
        // write your code here
        if(root == null || node == null) return root;
        recur(root, node);

        return root;
    }

    public void recur(TreeNode root, TreeNode node){
        if(node.val < root.val && root.left == null){
            root.left = node;
            return;
        }

        if(node.val > root.val && root.right == null){
            root.right =  node;
            return;
        }

       if(node.val < root.val){
            recur(root.left, node);
       }else {
            recur(root.right, node);
       }
    }

}
