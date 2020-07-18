package leetcode.nums61_90;

import q_util.ListNode;

//写的太乱 虽然AC了 但是可以用快慢指针去做！！！！
public class Ques61 {

    public ListNode rotateRight(ListNode head, int k) {

        if(head == null ) return head;

        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode temp = dummy;
        ListNode tail = null;
        int len = 0;
        while ( temp != null ) {
            temp = temp.next;
            len++;
            if(temp.next == null) {
                tail = temp;
            }
        }

        k = k % len;

        temp = dummy;
        for (int i = 0; i < len - k; i++) {
            temp = temp.next;
        }

        tail.next = dummy.next;
        dummy.next = temp.next;
        temp.next = null;

        return dummy.next;


    }


}
