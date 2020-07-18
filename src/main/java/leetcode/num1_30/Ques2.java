package leetcode.num1_30;

import q_util.ListNode;

public class Ques2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null || l2 == null){
            return null;
        }

        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        int carry = 0;

        while (l1 != null || l2 != null){
            int sum = carry;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }

            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }

            ListNode newNode = new ListNode(sum % 10);
            carry = sum / 10;
            head.next = newNode;
            head = newNode;
        }

        if(carry != 0){
            head.next = new ListNode(carry);
        }

        return dummy.next;
    }
}
