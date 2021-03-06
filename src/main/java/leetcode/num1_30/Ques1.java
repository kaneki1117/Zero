package leetcode.num1_30;

import java.util.HashMap;
import java.util.Map;

public class Ques1 {


    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int[] res = twoSum(nums, 9);
        System.out.println(res[0] + " - "  + res[1]);

    }

    public static int[] twoSum(int[] nums, int target) {

        int[] res = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])){
                res[0] = map.get(target - nums[i]);
                res[1] = i;
                break;
            }
            map.put(nums[i], i);

        }

        return res;

    }
}
