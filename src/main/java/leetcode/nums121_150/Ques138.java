package leetcode.nums121_150;

import q_util.ListNode;
import q_util.RandomNode;


//第一种传统法
//第二种 连接后split 未能AC，这版有问题 继续改。
public class Ques138 {

    public static void main(String[] args) {
        RandomNode randomNode1 = new RandomNode(1);
        RandomNode randomNode2 = new RandomNode(2);
        RandomNode randomNode3 = new RandomNode(3);
        randomNode1.next = randomNode2;
        randomNode2.next = randomNode3;
        randomNode1.random = randomNode3;
        randomNode2.random = randomNode2;

        copyRandomList(randomNode1);
    }

    public static RandomNode copyRandomList(RandomNode head) {

        if (head == null) return head;
        RandomNode dummy = new RandomNode(0);
        dummy.next = head;
        //1 copylist
        while (head != null) {
            RandomNode newNode =  new RandomNode(head.val);
            RandomNode temp = head.next;
            head.next = newNode;
            newNode.next = temp;
            head = temp;
        }

        head = dummy.next;
        //2 copyrandom
        while (head != null) {
            if (head.random == null) {
                head.next.random = null;
            } else {
                head.next.random = head.random.next;
            }
            head = head.next.next;
        }

        //3 split
        head = dummy.next;
        RandomNode newHead = head.next;

        while (head != null && head.next != null) {
            RandomNode temp = head.next;
            head.next = temp.next;
            head = temp;
        }

        return newHead;



    }



    /*public RandomNode copyRandomList(RandomNode head) {

        if (head == null) return head;

        RandomNode dummy = new RandomNode(0);
        dummy.next = head;

        RandomNode newDummy = new RandomNode(0);
        RandomNode newHead = newDummy;

        Map<RandomNode, RandomNode> map = new HashMap<>();

        while (head != null) {
            newHead.next = new RandomNode(head.val);
            newHead = newHead.next;
            map.put(head, newHead);
            head = head.next;
        }

        newHead = newDummy.next;
        head = dummy.next;
        while (head != null) {
            newHead.random = map.get(head.random);
            head = head.next;
            newHead = newHead.next;
        }

        return newDummy.next;

    }*/

}
