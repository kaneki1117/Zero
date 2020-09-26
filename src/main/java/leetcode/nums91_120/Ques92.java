package leetcode.nums91_120;

import q_util.ListNode;
import q_util.ListNodeUtil;

public class Ques92 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        ListNode listNode = ListNodeUtil.genListNodeList(arr);
        ListNode listNode1 = reverseBetween(listNode, 2, 4);
        ListNodeUtil.printListNodeList(listNode1);

    }

    public static ListNode reverseBetween(ListNode head, int m, int n) {

        if ( head == null ) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode curt = dummy;
        ListNode prev = null;


        for (int i = 0; i < m ; i++) {
            if( i == m - 1) {
                prev = curt;
            }
            curt = curt.next;
        }


        for (int i = m; i < n ; i++) {
            ListNode t = curt.next;
            curt.next = t.next;
            t.next = prev.next;
            prev.next = t;
        }


        return dummy.next;
    }
}
