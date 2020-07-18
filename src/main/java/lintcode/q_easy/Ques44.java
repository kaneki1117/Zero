package lintcode.q_easy;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

public class Ques44 {
    public static void main(String[] args) {
        List<Integer> list = Lists.newArrayList(1,2,3);
        System.out.println(minSubArray(list));

    }


    public static int minSubArray(List<Integer> nums) {
        // write your code here
        if(nums == null || nums.size() == 0){
            return -1;
        }
        int min = 0;
        int result = Integer.MAX_VALUE;

        for (int i = 0; i < nums.size(); i++) {
            min = Math.min(min+ nums.get(i), nums.get(i));
            result = Math.min(min, result);
        }
        return result;

    }
}
