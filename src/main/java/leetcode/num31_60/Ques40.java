package leetcode.num31_60;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * if(index != i && candidates[i-1] == candidates[i]) continue;这个判断 记住
 */
public class Ques40 {

    public static void main(String[] args) {
        int[] arr = {3, 1, 3, 5, 1, 1};
        int target = 8;
        System.out.println(combinationSum2(arr, target));
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {

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

            if(index != i && candidates[i-1] == candidates[i]) continue;
            integers.add(candidates[i]);
            helper(candidates, i + 1 , value - candidates[i], integers, res);
            integers.remove(integers.size() - 1);
        }
    }
}
