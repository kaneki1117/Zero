package leetcode.nums61_90;

import q_util.ListNode;
import q_util.ListNodeUtil;

//开始无法AC 多做几次
public class Ques82 {

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,3};
        int[] arr2 = {1,2,2,3,3};
        ListNode listNode = ListNodeUtil.genListNodeList(arr);
        ListNode listNode2 = ListNodeUtil.genListNodeList(arr2);
        ListNode listNode_1 = deleteDuplicates(listNode);
        ListNode listNode_2 = deleteDuplicates(listNode2);
        ListNodeUtil.printListNodeList(listNode_1);
        ListNodeUtil.printListNodeList(listNode_2);


    }

    public static ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curt = head;
        while (curt != null ) {

            while (curt.next != null && curt.val == curt.next.val) {
                curt = curt.next;
            }

            if(prev.next == curt) {
                prev = prev.next;
            } else {
                prev.next = curt.next;
            }

            curt = curt.next;

        }

        return dummy.next;

    }
}
