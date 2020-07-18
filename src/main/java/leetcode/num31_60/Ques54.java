package leetcode.num31_60;



import q_util.PrintUtil;

import java.util.ArrayList;
import java.util.List;

public class Ques54 {

    public static void main(String[] args) {

        int[][] matrix = {{1,2,3,4}, {5,6,7,8}};
        PrintUtil.printIntList(spiralOrder(matrix));

    }

    public static List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> list = new ArrayList();
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return list;

        int top = 0;
        int down = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= down && left <= right) {
            for (int i = left; i <= right ; i++) {
                list.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= down ; i++) {
                list.add(matrix[i][right]);
            }

            right--;

            if(top <= down) {
                for (int i = right; i >= left ; i--) {
                    list.add(matrix[down][i]);
                }
               down--;
            }

            if(left <= right) {
                for (int i = down; i >= top ; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
            }



        }

        return list;


    }
}
