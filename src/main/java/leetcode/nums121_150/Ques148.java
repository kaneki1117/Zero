package leetcode.nums121_150;

import q_util.ListNode;


//注意 这里findMedian fast = head.next!! 而不是head，head的话，不能拆成左右两边 容易越界。
public class Ques148 {


    public ListNode sortList(ListNode head) {
        if (head == null) return head;

        ListNode mid = findMedian(head);
        ListNode right = sortList(mid.next);
        mid.next = null;
        ListNode left = sortList(head);

        return mergeSort(left ,right);

    }

    private ListNode mergeSort(ListNode left, ListNode right) {

        ListNode dummy = new ListNode(0);
        ListNode head = dummy;

        while (left != null && right != null) {
            if(left.val < right.val) {
                head.next = left;
                left = left.next;
            } else {
                head.next = right;
                right = right.next;
            }
            head = head.next;
        }

        if (left != null) {
            head.next = left;
        } else {
            head.next = right;
        }

        return dummy.next;

    }


    public ListNode findMedian(ListNode head) {
        ListNode fast = head.next;
        ListNode slow = head;
        while (fast!= null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }
}
