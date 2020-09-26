package leetcode.nums91_120;

import q_util.TreeNode;

public class Ques105 {




    public static TreeNode buildTree(int[] preorder, int[] inorder) {

        if ( preorder == null || inorder == null || preorder.length != inorder.length) return null;

        return buildTree(preorder, inorder, 0, inorder.length - 1 , 0);

    }

    private static TreeNode buildTree(int[] preorder, int[] inorder, int inStart, int inEnd, int preStart) {
        if (inStart > inEnd ) {
            return null;
        }

        int index = inStart;
        for (; index <= inEnd ; index++) {
            if(inorder[index] == preorder[preStart]) {
                break;
            }
        }
        TreeNode root = new TreeNode(inorder[index]);

        root.left = buildTree(preorder, inorder, inStart, index - 1, preStart + 1);
        root.right = buildTree(preorder, inorder, index + 1, inEnd, preStart + index + 1 - inStart);
        return root;
    }
}
