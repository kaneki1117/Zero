package leetcode.nums91_120;

import q_util.TreeNode;

import java.util.*;

public class Ques103 {


    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean flag = false;

        while (!queue.isEmpty()) {
            int size  = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                list.add(poll.val);
                if(poll.left != null) queue.offer(poll.left);
                if(poll.right != null) queue.offer(poll.right);
            }
            if (flag) {
                Collections.reverse(list);
            }
            flag = !flag;
            result.add(list);
        }

        return result;
    }
}
