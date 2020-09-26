package leetcode.nums91_120;

import q_util.TreeNode;

public class Ques106 {

    public TreeNode buildTree(int[] inorder, int[] postorder) {

        if (inorder == null || postorder== null || inorder.length != postorder.length) {
            return null;
        }

        return buildTree(inorder, postorder, 0, inorder.length - 1 , 0  ,postorder.length - 1);

    }

    private TreeNode buildTree(int[] inorder, int[] postorder, int startIn, int endIn, int startPost, int endPost) {
        if ( startIn > endIn) {
            return null;
        }

        int index = startIn;
        for (; index <= endIn; index++) {
            if(inorder[index] == postorder[endPost]) {
                break;
            }
        }

        TreeNode root = new TreeNode(inorder[index]);
        root.left = buildTree(inorder, postorder, startIn, index - 1, startPost, startPost + index - 1 - startIn);
        root.right = buildTree(inorder, postorder, index + 1, endIn, startPost + index - startIn, endPost - 1);

        return root;
    }
}
