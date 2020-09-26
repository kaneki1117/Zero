package leetcode.nums91_120;

//没思路！！恶补恶补恶补。对dp不够熟
public class Ques91 {

    public static void main(String[] args) {

        String s = "10";
        System.out.println(numDecodings(s));

    }

    public static int numDecodings(String s) {
        
        if (s == null || s.length() == 0 || s.charAt(0) == '0') return 0;

        int[] dp = new int[s.length() + 1];
        dp[0] = 1;


        for (int i = 1; i <= s.length(); i++) {
            dp[i] = s.charAt(i-1) == '0' ? 0 : dp[i-1];
            if (i > 1 && (s.charAt(i-2)  == '1' || (s.charAt(i-2)  == '2' && s.charAt(i-1) <= '6'))) {
                dp[i] += dp[i - 2];
            }
        }

        return dp[s.length()];
        
    }
}
