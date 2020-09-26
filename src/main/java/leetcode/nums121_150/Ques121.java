package leetcode.nums121_150;

public class Ques121 {

    public static void main(String[] args) {
        int[] arr = {7,6,4,3,1};
        System.out.println(maxProfit(arr));

    }

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;

        int maxProfit = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            min = Math.min(prices[i], min);
            maxProfit = Math.max(maxProfit, prices[i] - min);
        }

        return maxProfit;

    }

}
