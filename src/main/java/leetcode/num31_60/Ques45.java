package leetcode.num31_60;

import java.util.Arrays;

public class Ques45 {

    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        System.out.println(jump(nums));

    }

    //贪心
    public static int jump(int[] nums) {
        int jumps = 0, curEnd = 0, curFarthest = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            curFarthest = Math.max(curFarthest, i + nums[i]);
            if (i == curEnd) {
                jumps++;
                curEnd = curFarthest;

                if (curEnd >= nums.length - 1) {
                    break;
                }
            }
        }
        return jumps;
    }

    /*AC 但是时间慢
    public static int jump(int[] nums) {
        if(nums == null || nums.length == 0) return 0;

        int[] count = new int[nums.length];
        Arrays.fill(count, Integer.MAX_VALUE);
        count[0] = 0;
        for (int i = 0; i < nums.length; i++) {

            int val = nums[i];
            for (int j = i + 1; j < nums.length && j <= i + val; j++) {
                count[j] = Math.min( count[j] , count[i] + 1);
            }

        }
        return count[count.length - 1];
    }*/


}
