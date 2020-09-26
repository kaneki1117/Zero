package leetcode.nums121_150;

import q_util.ListNode;

//注意 每次判断条件都要有 fast.next == null
public class Ques142 {

    public static void main(String[] args) {

    }

    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                break;
            }
        }

        if(fast == null || fast.next == null) return null;

        ListNode temp = fast;

        while (temp != head) {
            head = head.next;
            temp = temp.next;
        }

        return temp;
    }
}
