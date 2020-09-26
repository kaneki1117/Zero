package leetcode.nums121_150;

public class Ques123 {

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));

    }

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;

        int len = prices.length;

        int[][] lo = new int[len + 1][3];
        int[][] gl = new int[len + 1][3];

        for (int i = 1; i < len; i++) {
            int diff = prices[i] - prices[i-1];
            for (int j = 1 ; j <= 2; j++){
                lo[i][j] = Math.max(gl[i-1][j-1] + Math.max(0,diff),lo[i-1][j] + diff);
                gl[i][j] = Math.max(gl[i-1][j], lo[i][j]);
            }
        }

        return gl[len - 1][2];

    }

}
