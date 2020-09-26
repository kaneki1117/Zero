package leetcode.nums91_120;

import q_util.ListNode;
import q_util.TreeNode;
//注意 要
public class Ques109 {


    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return new TreeNode(head.val);

        ListNode slow = head;
        ListNode fast = head;
        ListNode lastOne = slow;

        while (fast != null && fast.next != null) {
            lastOne = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        lastOne.next = null;


        TreeNode node = new TreeNode(slow.val);
        node.left = sortedListToBST(head);

        node.right = sortedListToBST(slow.next);

        return node;
    }
}
