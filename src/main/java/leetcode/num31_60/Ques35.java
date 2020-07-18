package leetcode.num31_60;

public class Ques35 {

    public static void main(String[] args) {

        int[] arr = {1,3,5,6};
        int target = 5;
        System.out.println(searchInsert(arr , target));

    }

    public static int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;

        int start = 0;
        int end = nums.length - 1;
        while (start + 1 < end) {
            int mid = (end - start) / 2 + start;
            if(nums[mid] < target){
                start = mid;
            }else {
                end = mid;
            }
        }

        if(nums[start] >= target) return start;
        if(nums[end] >= target) return end;
         return end + 1;

    }
}
