package leetcode.nums61_90;

public class Ques75 {

    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sortColors(arr);
    }

    public static void sortColors(int[] nums) {
        if( nums == null || nums.length == 0 ) return;

        int left = 0; int right = nums.length - 1;
        int i = 0;
        while (i <= right) {
            if (nums[i] == 0) {
                swap(nums, i , left);
                i++;
                left++;
            } else if(nums[i] == 1) {
                i++;
            } else {
                swap(nums, i, right);
                right--;
            }
        }

    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
