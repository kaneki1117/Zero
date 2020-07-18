package lintcode.q_easy;

public class Ques41 {
    public static void main(String[] args) {

        int[] arr = {-2,2,-3,4,-1,2,1,-5,3};
        System.out.println(maxSubArray(arr));
    }

    public static int maxSubArray(int[] nums) {
        // write your code here
        if(nums == null || nums.length == 0){
            return -1;
        }

        int curSum = 0;
        int sum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length ; i++) {
           curSum = Math.max(curSum + nums[i], nums[i]);
           sum = Math.max(sum, curSum);

        }

        return sum;

    }

}
