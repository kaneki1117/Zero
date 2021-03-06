package leetcode.num31_60;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ques39 {

    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 7};
        int target = 7;
        System.out.println(combinationSum(arr, target));
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> res = new ArrayList<>();
        if (candidates == null || candidates.length == 0) return res;

        Arrays.sort(candidates);
        helper(candidates, 0 , target, new ArrayList<Integer>(), res);

        return res;

    }

    private static void helper(int[] candidates, int index, int value, ArrayList<Integer> integers, List<List<Integer>> res) {
        if (value == 0) {
            res.add(new ArrayList<>(integers));
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            if (candidates[i] > value) break;
            integers.add(candidates[i]);
            helper(candidates, i , value - candidates[i], integers, res);
            integers.remove(integers.size() - 1);
        }
    }
}
