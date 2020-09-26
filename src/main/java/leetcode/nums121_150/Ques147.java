package leetcode.nums121_150;

import q_util.ListNode;
//注意 开始不要建立 dummy和head的连接，类似于 新开一个链路 做排序。
//未能AC
public class Ques147 {

    public ListNode insertionSortList(ListNode head) {

        if (head == null) return head;

        ListNode dummy = new ListNode(0);


        ListNode curt = head;
        ListNode prev = dummy;

        while (curt != null) {

            ListNode next = curt.next;
            while (prev.next != null && prev.next.val < curt.val) {
                prev = prev.next;
            }

            curt.next = prev.next;
            prev.next = curt;

            prev = dummy;
            curt = next;
        }

        return dummy.next;

    }
}
