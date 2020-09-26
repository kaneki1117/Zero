package leetcode.nums61_90;

import java.util.Arrays;
//如何O1的空间 很重要
public class Ques73 {

    public static void main(String[] args) {
        int[][] arr = {{1,0,3}};
        setZeroes(arr);
    }

    public static void setZeroes(int[][] matrix) {

        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return;

        int m = matrix.length;
        int n = matrix[0].length;

        boolean row = false;
        boolean col = false;

        for (int i = 0; i < m; i++) {
            if(matrix[i][0] == 0){
                col =true;
                break;
            }
        }

        for (int i = 0; i < n; i++) {
            if(matrix[0][i] == 0){
                row =true;
                break;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j] == 0 ) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }


        for (int i = 1; i < m; i++) {
            if(matrix[i][0] == 0) Arrays.fill(matrix[i],0);
        }

        for (int i = 1; i < n; i++) {
            if(matrix[0][i] == 0) {
                for (int j = 0; j < m; j++) {
                    matrix[j][i] = 0;
                }
            }
        }

        if(row) {
            Arrays.fill(matrix[0],0);
        }

        if(col) {
            for (int j = 0; j < m; j++) {
                matrix[j][0] = 0;
            }
        }



    }

}
