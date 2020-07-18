package leetcode.num1_30;

import q_util.ListNode;
//1->2->3->4  2
public class Ques19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head == null || n <= 0) return null;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        int length = 0;

        ListNode temp = head;

        while (temp != null){
            length ++;
            temp = temp.next;
        }
        int nth = length - n + 1;
        if(nth <= 0 ) return null;

        ListNode pre = dummy;
        ListNode cur = head;
        for (int i = 1; i < nth; i++) {
            pre = pre.next;
            cur = cur.next;
        }

        ListNode re = cur.next;
        cur.next = null;
        pre.next = re;

        return  dummy.next;

    }
}
