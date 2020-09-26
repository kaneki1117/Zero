package leetcode.nums91_120;

import q_util.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Ques99 {

    public void recoverTree(TreeNode root) {
        if (root == null) return;

        List<TreeNode> list = new ArrayList<>();

        inorder(root, list);

        int[] arr = new int[list.size()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i).val;
        }

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            list.get(i).val = arr[i];
        }

    }

    private void inorder(TreeNode root, List<TreeNode> list) {
        Stack<TreeNode> stack = new Stack<>();

        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            list.add(root);
            root = root.right;
        }

    }
}
