package lintcode.contest;

import q_util.PrintUtil;

import java.util.ArrayList;
import java.util.List;

public class Ques1 {

    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        PrintUtil.printArray(createTargetArray(arr, index));
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        if(nums == null || nums.length == 0 ) return nums;


        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < index.length; i++) {
            if(nums.length < index[i]) break;
            int target = nums[i];
            list.add(index[i], target);
        }



        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        return arr;



    }
}
