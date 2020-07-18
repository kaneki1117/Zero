package lintcode.q_easy;

import java.util.List;

public class Ques46 {
    public int majorityNumber(List<Integer> nums) {
        // write your code here
        if(nums == null || nums.size() == 0){
            return -1;
        }

        int cur = nums.get(0);
        int count = 1;
        for (int i = 1; i < nums.size(); i++) {
            if(nums.get(i) == cur){
                count++;
            }else {
                count--;
            }
            if(count == 0){
                cur = nums.get(i);
                count = 1;
            }
        }

        int check = 0;
        for (int i = 0; i < nums.size(); i++) {
            if(nums.get(i) == cur) check++;
        }
        if(check > nums.size() /  2) return cur;

        return -1;

    }


}
