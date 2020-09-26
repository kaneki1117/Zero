package leetcode.nums61_90;

public class Ques74 {

    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10, 11, 16, 20},{23, 30, 34, 50}};
        int target = 3;
        System.out.println(searchMatrix(matrix, target));

    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int m = matrix.length - 1;
        int n = 0;

        while (m >= 0 && n <= matrix[0].length) {
            if(matrix[m][n] == target) {
                return true;
            } else if(matrix[m][n] < target) {
                n++;
            } else {
                m--;
            }
        }

        return false;

    }

}
