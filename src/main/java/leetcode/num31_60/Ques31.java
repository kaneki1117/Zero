package leetcode.num31_60;

import q_util.PrintUtil;

public class Ques31 {

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3};
        int[] nums2 = {3, 2, 1};
        nextPermutation(nums1);
        nextPermutation(nums2);
        PrintUtil.printArray(nums1);
        PrintUtil.printArray(nums2);


    }


    public static void nextPermutation(int[] nums) {
        if (nums == null || nums.length == 0) return;

        int idx = nums.length - 2;
        int yidx = nums.length - 1;

        for (; idx >= 0; idx--) {
            if (nums[idx + 1] > nums[idx]) break;
        }

        if (idx >= 0) {
            for (; yidx > 0 && yidx > idx; yidx--) {
                if (nums[yidx] > nums[idx]) break;
            }
            swap(nums, idx, yidx);
        }

        reverse(nums, idx + 1, nums.length - 1);


    }


    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i++, j--);
        }
    }
}
