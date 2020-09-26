package leetcode.nums61_90;

import q_util.ListNode;
import q_util.ListNodeUtil;

public class Ques86 {

    public static void main(String[] args) {
        int[] arr = {1,4,3,2,5,2};
        ListNode listNode = ListNodeUtil.genListNodeList(arr);
        partition(listNode, 3);
        ListNodeUtil.printListNodeList(listNode);
    }

    public static ListNode partition(ListNode head, int x) {

        if ( head == null) return head;

        ListNode right = new ListNode(0);
        ListNode left  = new ListNode(0);
        ListNode leftDummy = left;
        ListNode rightDummy = right;


        ListNode cur = head;
//1,4,3,2,5,2
        while ( cur != null) {
            if ( cur.val < x) {
                left.next = cur;
                left = cur;
            } else {
                right.next = cur;
                right = cur;
            }
            //注意这里
            ListNode temp = cur.next;
            cur.next = null;
            cur = temp;
        }

        left.next = rightDummy.next;

        return leftDummy.next;




    }


}
