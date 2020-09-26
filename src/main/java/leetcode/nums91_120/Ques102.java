package leetcode.nums91_120;

import q_util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Ques102 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if ( root == null) return result;


        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode treeNode = queue.poll();
                list.add(treeNode.val);
                if ( treeNode.left != null) {
                    queue.offer(treeNode.left);
                }

                if ( treeNode.right != null) {
                    queue.offer(treeNode.right);
                }
            }
            result.add(list);
        }
        return result;
    }
}
