package leetcode.q_easy;

import q_util.ListNode;

public class Ques141 {

    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;

        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast ) return true;
        }
        return false;

    }
}