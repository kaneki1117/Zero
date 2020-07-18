package leetcode.q_medium;

import q_util.ListNode;

public class Ques148 {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode leftDummy = new ListNode(0), leftTail = leftDummy;
        ListNode midDummy = new ListNode(0), midTail = midDummy;
        ListNode rightDummy = new ListNode(0), rightTail = rightDummy;

        ListNode mid = findMedian(head);

        while (head != null){
            if(head.val < mid.val){
                leftTail.next = head;
                leftTail = head;
            }else if(head.val > mid.val){
                rightTail.next = head;
                rightTail = head;
            }else {
                midTail.next = head;
                midTail = head;
            }
            head = head.next;
        }
        leftTail.next = null;
        midTail.next = null;
        rightTail.next = null;

        ListNode left = sortList(leftDummy.next);
        ListNode right = sortList(rightDummy.next);

        return concat(left, midDummy.next, right);



    }
    //findK

    public ListNode findMedian(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private ListNode concat(ListNode left, ListNode middle, ListNode right) {
        ListNode dummy = new ListNode(0), tail = dummy;
        tail.next = left; tail = getTail(tail);
        tail.next = middle; tail = getTail(tail);
        tail.next = right; tail = getTail(tail);
        return dummy.next;
    }

    private ListNode getTail(ListNode head) {
        if (head == null) {
            return null;
        }

        while (head.next != null) {
            head = head.next;
        }
        return head;
    }



    //getTail
}
