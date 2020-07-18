package leetcode.num1_30;

import java.util.Arrays;

public class Ques16 {

    public static void main(String[] args) {
        int[] nums = {-1,0,2,3};
        int target = -2;
        System.out.println(threeSumClosest(nums,target));
    }

    public static int threeSumClosest(int[] nums, int target) {
        if(nums == null || nums.length < 3){
            return 0;
        }

        Arrays.sort(nums);
        int result = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length; i++) {
            int start = i + 1; int end = nums.length - 1;
            while (start < end){
                int sum = nums[i] + nums[start] + nums[end];
                if(Math.abs(target - sum) < Math.abs(target - result)){
                    result = sum;
                }
                if(sum < target){
                    start++;
                }else {
                    end --;
                }

            }
        }

        return result;



    }

}
