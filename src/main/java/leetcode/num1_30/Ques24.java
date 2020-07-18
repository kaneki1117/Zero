package leetcode.num1_30;
// 画图理解
import q_util.ListNode;

public class Ques24 {

    public static void main(String[] args) {

    }

    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode pre = dummy;

        while (pre.next != null && pre.next.next != null){
            ListNode cur = pre.next.next;
            pre.next.next = cur.next;
            cur.next = pre.next;
            pre.next = cur;
            pre = cur.next;
        }

        return dummy.next;
    }
}
