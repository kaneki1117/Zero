package leetcode.num31_60;

import q_util.PrintUtil;

public class Ques34 {

    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 9;

        PrintUtil.printArray(searchRange(arr, target));
    }

    public static int[] searchRange(int[] nums, int target) {

        int[] res = {-1, -1};

        if (nums == null || nums.length == 0) return res;

        res[0] = findFirst(nums, target);
        res[1] = findLast(nums, target);
        return  res;

    }

    public static int findFirst(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start + 1 < end) {
            int mid = (end - start) / 2 + start;
            if(nums[mid] < target ){
                start = mid;
            }else {
                end = mid;
            }
        }
        if(nums[start] == target) return start;
        if(nums[end] == target) return end;
        return -1;
    }

    public static int findLast(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start + 1 < end) {
            int mid = (end - start) / 2 + start;
            if(nums[mid] > target ){
                end = mid;
            }else {
                start = mid;
            }
        }
        if(nums[end] == target) return end;
        if(nums[start] == target) return start;
        return -1;
    }





}
