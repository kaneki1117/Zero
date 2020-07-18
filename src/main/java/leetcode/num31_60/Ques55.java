package leetcode.num31_60;

public class Ques55 {

    public boolean canJump(int[] nums) {

        if(nums == null || nums.length == 0) return false;

        int[] dp = new int[nums.length + 1];

        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1] , nums[i-1]) - 1;
            if(dp[i] < 0 ) return false;
        }

        return true;

    }
}
