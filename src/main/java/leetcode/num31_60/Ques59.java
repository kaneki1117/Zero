package leetcode.num31_60;

import q_util.PrintUtil;

public class Ques59 {

    public static void main(String[] args) {
        PrintUtil.print2DMatrix(generateMatrix(3));
    }

    public static int[][] generateMatrix(int n) {
        if(n < 0) return null;
        int[][] res = new int[n][n];
        int value = 1;

        int top = 0;
        int down = n - 1;
        int left = 0;
        int right = n - 1;
        while (top <= down && left <= right) {

            for (int i = left; i <= right ; i++) {
                res[top][i] = value++;
            }
            top++;
            for (int i = top; i <= down ; i++) {
                res[i][right] = value++;
            }
            right--;

            if(top <= down) {
                for (int i = right; i >= left ; i--) {
                    res[down][i] = value++;
                }
                down--;
            }

            if(left <= right) {
                for (int i = down; i >= top ; i--) {
                    res[i][left] = value++;
                }
                left++;
            }

        }

        return res;

    }
}
