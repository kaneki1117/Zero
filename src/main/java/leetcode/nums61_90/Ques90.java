package leetcode.nums61_90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//注意 i + 1 不是 index + 1
public class Ques90 {

    public static void main(String[] args) {
        int[] arr = {1,2,2};
        System.out.println(subsetsWithDup(arr));
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        if ( nums == null || nums.length == 0) return list;

        Arrays.sort(nums);
        helper(nums , 0 , new ArrayList<Integer>(), list);
        return list;

    }

    private static void helper(int[] nums, int index, ArrayList<Integer> tempList, List<List<Integer>> list) {

        list.add(new ArrayList<>(tempList));


        for (int i = index; i < nums.length; i++) {
            if ( i != index && nums[i] == nums[i-1] ) continue;
            tempList.add(nums[i]);
            helper(nums, i + 1, tempList, list);
            tempList.remove(tempList.size() - 1);

        }

    }
}
