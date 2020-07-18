package leetcode.num1_30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//***记住 while循环 的位置
public class Ques15 {

    public static void main(String[] args) {
        int[] nums = {0,0,0};
        List<List<Integer>> res = threeSum(nums);
        System.out.println();
    }

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        if(nums == null || nums.length < 3){
            return res;
        }
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if(i > 0 && nums[i] == nums[i-1]) continue;
            twoPoint(nums, i+1 , nums.length - 1, nums[i] , res);
        }

        return res;

    }

    public static void twoPoint(int[] nums , int left , int right, int value, List<List<Integer>> res){

        while (left < right){
            if(nums[left] + nums[right] + value == 0){
                List<Integer> list = new ArrayList<>();
                list.add(nums[left]);
                list.add(nums[right]);
                list.add(value);
                res.add(list);
                while (left < nums.length - 1 && nums[left] == nums[left + 1]) left++;
                while (right > 0 && nums[right] == nums[right - 1]) right--;
                left++;
                right--;
            }else if(nums[left] + nums[right] + value > 0){
                right--;
            }else {
                left++;
            }
        }
    }



}
