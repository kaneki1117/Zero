package leetcode.num31_60;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Ques46 {

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> result = permute(nums);
        System.out.println(result.size());
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0) return result;
        Arrays.sort(nums);
        helper(nums, new ArrayList<Integer>(), new HashSet<Integer>(), result);

        return result;

    }

    private static void helper(int[] nums, ArrayList<Integer> integers, HashSet<Integer> set,
                        List<List<Integer>> result) {
        if (integers.size() == nums.length) {
            result.add(new ArrayList<>(integers));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) continue;
            integers.add(nums[i]);
            set.add(nums[i]);
            helper(nums, integers, set, result);
            integers.remove(integers.size() - 1);
            set.remove(nums[i]);
        }

    }
}
