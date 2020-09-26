package leetcode.nums121_150;

import q_util.TreeNode;

import java.util.ArrayList;
import java.util.List;
//有更好更快的方法！
public class Ques129 {

    public static void main(String[] args) {
        TreeNode t = new TreeNode(1);
        t.left = new TreeNode(2);
        t.right = new TreeNode(3);
        System.out.println(sumNumbers(t));
    }

    public static int sumNumbers(TreeNode root) {
        if (root == null) return 0;

        List<String> result = new ArrayList<>();

        String s = "" + root.val;
        helper(root, s, result);

        int val = 0;

        for (String str : result) {
            val += Integer.valueOf(str);
        }

        return val;
    }


    public static void helper(TreeNode root, String str, List<String> result) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            result.add(str);
        }

        if (root.left != null) {
            helper(root.left, str + root.left.val, result);
        }

        if (root.right != null) {
            helper(root.right, str + root.right.val, result);

        }
    }
}
