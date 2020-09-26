package leetcode.nums61_90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ques78 {

    public static void main(String[] args) {
        int[] nums = {1,2,3};

        List<List<Integer>> res = subsets(nums);
        System.out.println();
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums == null || nums.length == 0) return result;

        Arrays.sort(nums);

        helper(nums, 0, new ArrayList<Integer>(), result);


        return result;
    }

    private static void helper(int[] nums, int index, ArrayList<Integer> list, List<List<Integer>> result) {

        result.add(new ArrayList<>(list));

        for (int i = index; i < nums.length; i++) {
            list.add(nums[i]);
            helper(nums, i + 1, list, result);

            list.remove(list.size()-1);
        }
    }
}
