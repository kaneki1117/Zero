package leetcode.nums91_120;


import q_util.TreeNode;

import java.util.ArrayList;
import java.util.List;

// 不会做 没有考虑到 典型的分治法
public class Ques95 {

    public static void main(String[] args) {
        System.out.println(generateTrees(3));

    }

    public static List<TreeNode> generateTrees(int n) {

        return generate(1, n);

    }

    private static List<TreeNode> generate(int start, int end) {

        List<TreeNode> list = new ArrayList<>();
        if ( start > end) {
            list.add(null);
            return list;
        }

        for (int i = start; i <= end ; i++) {

            List<TreeNode> left = generate(start, i - 1);
            List<TreeNode> right = generate(i+1, end);

            for ( TreeNode leftN : left) {
                for ( TreeNode rightN : right) {
                    TreeNode root = new TreeNode(i);
                    root.left = leftN;
                    root.right = rightN;
                    list.add(root);
                }
            }

        }

        return list;

    }
}
