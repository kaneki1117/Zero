package leetcode.nums61_90;

public class Ques64 {

    public static void main(String[] args) {
        int[][] grid = {
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}};
        System.out.println(minPathSum(grid));

    }

    public static int minPathSum(int[][] grid) {

        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        int m = grid.length;
        int n = grid[0].length;

        int[] val = new int[n];
        val[0] = grid[0][0];
        for (int i = 1; i < val.length; i++) {
            val[i] = grid[0][i] + val[i - 1];
        }

        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    val[j] = grid[i][0] + val[j];
                } else {
                    val[j] = Math.min(val[j - 1] + grid[i][j], val[j] + grid[i][j]);
                }

            }
        }

        return val[n - 1];

    }
}
