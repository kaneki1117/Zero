package leetcode.nums91_120;

import q_util.Node;
public class Ques116 {

    public Node connect(Node root) {
        if(root == null ) return root;

        if (root.left != null) {
            root.left.next = root.right;
        }

        if (root.right != null && root.next != null) {
            root.right.next = root.next.left;
        }
        connect(root.left);
        connect(root.right);

        return root;


    }


}
