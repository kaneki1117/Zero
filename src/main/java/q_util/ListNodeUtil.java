package q_util;

public class ListNodeUtil {

    public static ListNode genListNodeList(int[] arr) {
        ListNode[] listNodes = new ListNode[arr.length];
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        for (int i = 0; i < arr.length; i++) {
            listNodes[i] = new ListNode(arr[i]);
            head.next = listNodes[i];
            head = head.next;
        }

        return dummy.next;
    }

    public static void printListNodeList(ListNode head) {
        while (head != null) {
            System.out.print(head.val +", ");
            head = head.next;
        }
        System.out.println();
    }
}
