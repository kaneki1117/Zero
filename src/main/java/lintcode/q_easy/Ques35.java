package lintcode.q_easy;

import q_util.ListNode;

public class Ques35 {

    public ListNode reverse(ListNode head) {
        ListNode pre = null;
        while (head != null){
            ListNode temp = head.next;
            head.next = pre;
            pre = head;
            head = temp;
        }

        return pre;
    }
}
