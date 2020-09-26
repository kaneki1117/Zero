package leetcode.nums91_120;

import q_util.Node;

import java.util.LinkedList;
import java.util.Queue;
//虽然能AC，未满足要求的constant space的解法 具体查看对应的blog
public class Ques117 {

    public Node connect(Node root) {
        if (root == null) return null;


        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            Node dummy = new Node(0);
            Node head = dummy;
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                head.next = node;
                head = node;
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
        }

        return root;

    }
}
