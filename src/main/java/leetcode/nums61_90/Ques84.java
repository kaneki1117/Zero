package leetcode.nums61_90;

import java.util.Stack;

public class Ques84 {

    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(heights));

    }

    public static int largestRectangleArea(int[] heights) {

        if (heights == null || heights.length == 0) return 0;

        Stack<Integer> stack = new Stack<>();
        int res = 0;

        for (int i = 0; i <= heights.length; i++) {
            int h = i == heights.length ? 0 : heights[i];

            if(stack.isEmpty() || heights[stack.peek()] < h) {
                stack.push(i);
            } else {
                int index = stack.pop();
                res = Math.max(res, heights[index] * (stack.isEmpty() ? i : i - stack.peek() - 1));
                i--;
            }

        }

        return res;

    }

    
}
