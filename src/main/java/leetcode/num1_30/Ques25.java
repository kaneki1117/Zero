package leetcode.num1_30;


//较难 变量太多 思路一定要清晰 多做多写几次
import q_util.ListNode;

public class Ques25 {

    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k <= 1)  return head;

        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode cur = dummy;
        while (cur != null) {
            cur = reverseK(cur, k);
        }
        return dummy.next;
    }

    private ListNode reverseK(ListNode cur, int k) {
        ListNode n1= cur.next;
        ListNode nk = cur;

        for (int i = 0; i < k; i++) {
            nk = nk.next;
            if(nk == null) return null;
        }

        if(nk == null) return null;

        ListNode nkplus = nk.next;

        ListNode curt = n1;
        ListNode prev = null;

        while (curt != nkplus){
            ListNode temp = curt.next;
            curt.next = prev;
            prev = curt;
            curt = temp;
        }

        cur.next = nk;
        n1.next = nkplus;

        return n1;

    }


}
