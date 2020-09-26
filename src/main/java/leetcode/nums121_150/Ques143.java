package leetcode.nums121_150;

import q_util.ListNode;
import q_util.ListNodeUtil;
import q_util.PrintUtil;

//Given 1->2->3->4->5, reorder it to 1->5->2->4->3.
// 1-2-3  5-4
public class Ques143 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        ListNode listNode = ListNodeUtil.genListNodeList(arr);
        reorderList(listNode);
        ListNodeUtil.printListNodeList(listNode);
    }

    public static void reorderList(ListNode head) {

        if (head == null) {
            return;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode midStart = slow.next;
        slow.next = null;
        slow = null;
        while (midStart != null) {
            ListNode temp = midStart.next;
            midStart.next = slow;
            slow = midStart;
            midStart = temp;
        }

        while (slow != null) {
            ListNode temp = head.next;
            ListNode temp2 = slow.next;
            head.next = slow;
            slow.next = temp;
            head =temp;
            slow = temp2;
        }
    }
}
