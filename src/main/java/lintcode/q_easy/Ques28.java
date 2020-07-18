package lintcode.q_easy;

public class Ques28 {
//不够熟悉 需要继续
    public static void main(String[] args) {
        int target = 8;
        int[][] matrix = {{1,2,3},{6,7,8}};
        System.out.println(searchMatrix(matrix, target));

    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return false;
        }

        int m = matrix.length ;
        int n = matrix[0].length ;
        int start = 0;
        int end = m * n;
        while (start < end){
            int mid = (end - start) / 2 + start;
            if(matrix[mid / n ][ mid % n ] == target) return true;

            if(matrix[mid / n ][ mid % n ] < target){
                start = mid + 1;
            }else {
                end = mid;
            }
        }

        return false;
    }
}
