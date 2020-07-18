package lintcode.q_easy;

import java.util.PriorityQueue;

public class Ques80 {
    public static void main(String[] args) {
        int[] arr1 = {7,9,4,5};
        int[] arr2 = {4, 5, 1, 2, 3};
        System.out.println(median(arr1));
        System.out.println(median(arr2));

    }


    public static int median(int[] nums) {
        // write your code here
        if(nums == null || nums.length == 0) return -1;

        int heapSize = nums.length / 2 + 1;

        PriorityQueue<Integer> queue = new PriorityQueue<>(heapSize);
        for (int i = 0; i < heapSize; i++) {
            queue.offer(nums[i]);
        }


        for (int i = heapSize; i < nums.length; i++) {
            if (queue.peek() < nums[i]) {
                queue.poll();
                queue.add(nums[i]);
            }
        }

        return queue.peek();

    }
}
