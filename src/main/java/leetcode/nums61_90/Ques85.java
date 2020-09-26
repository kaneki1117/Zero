package leetcode.nums61_90;

import java.util.Stack;

public class Ques85 {

    public int maximalRectangle(char[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return 0;

        int m = matrix.length;
        int n = matrix[0].length;

        int[] len = new int[n+1];
        int res = 0;

        for (int i = 0; i < m; i++) {
            Stack<Integer> stack = new Stack<>();

            for (int j = 0; j < n; j++) {
                if(matrix[i][j] == '1') {
                    len[j] = len[j] + 1;
                } else {
                    len[j] = 0;
                }
            }

            for (int j = 0; j <= n; j++) {
                if(stack.isEmpty() || len[j] > len[stack.peek()]){
                    stack.push(j);
                } else {
                    int index = stack.pop();
                    res = Math.max(res, len[index] * (stack.isEmpty() ? j : j - 1 - stack.peek()));
                    j--;
                }
            }
        }

        return res;
    }
}
