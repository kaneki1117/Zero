package leetcode.nums61_90;

import q_util.ListNode;
import q_util.ListNodeUtil;

public class Ques83 {

    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3};
        ListNode listNode = ListNodeUtil.genListNodeList(arr);
        ListNode node = deleteDuplicates(listNode);
        ListNodeUtil.printListNodeList(node);
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = head;
        ListNode curt = head.next;
        while (curt != null) {
            if(curt.val == prev.val) {
                prev.next = curt.next;
            } else {
                prev = prev.next;
            }
            curt = curt.next;
        }

        return dummy.next;

    }
}
