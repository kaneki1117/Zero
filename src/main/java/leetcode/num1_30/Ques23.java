package leetcode.num1_30;

import q_util.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Ques23 {

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;

        Comparator<ListNode> cmp = new Comparator<ListNode>() {
            public int compare(ListNode e1, ListNode e2) {
                return e1.val - e2.val;
            }
        };
        PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(cmp);
        for (int i = 0; i < lists.length; i++) {
            if(lists[i] == null) continue;
            queue.offer(lists[i]);
        }

        while (!queue.isEmpty()){
            ListNode poll = queue.poll();
            head.next = poll;
            if(poll.next != null){
                queue.offer(poll.next);
            }
            head = head.next;
        }

        return dummy.next;


    }
}
