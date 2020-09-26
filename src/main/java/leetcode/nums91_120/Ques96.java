package leetcode.nums91_120;


//注：求所有的方法数时，首先考虑dp

public class Ques96 {

    public static void main(String[] args) {
        System.out.println(numTrees(19));
    }

    public static int numTrees(int n) {
        if ( n <= 0) return 0;
        int[] dp = new int[n+1];

        dp[0] = dp[1] = 1;

        for (int i = 2; i < dp.length; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i - j - 1];
            }
        }


        return dp[n];


    }

}
