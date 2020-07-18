package leetcode.num31_60;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Ques47 {

    public static void main(String[] args) {
        int[] nums = {1, 1, 3};
        List<List<Integer>> result = permuteUnique(nums);
        System.out.println(result.size());
    }

    public static List<List<Integer>> permuteUnique(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0) return result;
        Arrays.sort(nums);
        boolean[] visit = new boolean[nums.length];
        helper(nums, new ArrayList<Integer>(), visit, result);

        return result;
    }

    private static void helper(int[] nums, ArrayList<Integer> integers,
                               boolean[] visit, List<List<Integer>> result) {
        if (integers.size() == nums.length) {
            result.add(new ArrayList<>(integers));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (visit[i] || (
                    i != 0 && nums[i] == nums[i - 1] && visit[i - 1] == false)) continue;

            integers.add(nums[i]);
            visit[i] = true;
            helper(nums, integers, visit, result);
            integers.remove(integers.size() - 1);
            visit[i] = false;
        }


    }
}
