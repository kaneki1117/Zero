package leetcode.nums121_150;

import java.util.HashMap;
import java.util.Map;

public class Ques146 {

    private class Node {
        Node prev;
        Node next;
        int key;
        int value;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private int capacity;
    private Map<Integer, Node> map = new HashMap<>();
    private Node head = new Node(-1, -1);
    private Node tail = new Node(-1, -1);


    public Ques146(int capacity) {
        this.capacity = capacity;
        tail.prev = head;
        head.next = tail;
    }


    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }

        Node current = map.get(key);
        current.prev.next = current.next;
        current.next.prev = current.prev;

        //move to tail
        moveToTail(current);
        return map.get(key).value;

    }

    public void put(int key, int value) {
        if(get(key) != -1) {
            map.get(key).value = value;
            return;
        }

        if(map.size() == capacity) {
            map.remove(head.next.key);
            head.next = head.next.next;
            head.next.prev = head;
        }

        Node insert = new Node(key,value);
        map.put(key, insert);
        moveToTail(insert);

    }


    private void moveToTail(Node current) {
        current.prev = tail.prev;
        tail.prev = current;
        current.prev.next = current;
        current.next = tail;
    }



}


