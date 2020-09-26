package leetcode.nums121_150;

public class Ques122 {

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));

    }

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;

        int profit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i+1] - prices[i] > 0) {
                profit += prices[i+1] - prices[i];
            }
        }

        return profit;


    }
}
