package leetcode.nums91_120;

import q_util.TreeNode;

import java.util.*;

public class Ques107 {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if ( root == null) return result;


        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode q = queue.poll();
                list.add(q.val);
                if ( q.left != null) queue.offer(q.left);
                if ( q.right != null) queue.offer(q.right);
            }

            result.add(list);

        }

        Collections.reverse(result);
        return result;

    }

    public static void main(String[] args) {

    }
}
