package leetcode.nums61_90;

public class Ques81 {

    public static void main(String[] args) {
        int[] nums = {2,5,6,0,0,1,2};
        int target = 0;
        int target1 = 3;
        System.out.println(search(nums, target));
        System.out.println(search(nums, target1));

    }

    public static boolean search(int[] nums, int target) {

        if(nums == null || nums.length == 0) return false;

        int start = 0, end = nums.length - 1;
        while (start + 1 < end) {
            int mid = (end - start) / 2 + start;
            if(nums[mid] == target) {
                return true;
            }

            if (nums[mid] > nums[start]) {
                if(target >= nums[start] && target <= nums[mid]) {
                    end = mid;
                } else {
                    start = mid;
                }
            }  else if (nums[mid] < nums[start]) {
                if(target >= nums[mid] && target <= nums[end]) {
                    start = mid;
                } else {
                    end = mid;
                }
            } else {
                start++;
            }

        }

        if(nums[start] == target || nums[end] == target) return true;

        return false;




    }
}
