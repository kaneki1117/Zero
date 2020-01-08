package algorithm.binary;

public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = {1,2,2,3,4};
        System.out.println(search_1(nums,2));
        System.out.println(search_1(nums,4));
        System.out.println(search_1(nums,5));
    }


    public static int search_1(int[] nums, int target){
        if(nums == null || nums.length == 0){
            return -1;
        }
        int start = 0; int end = nums.length - 1;
        while (start + 1 < end){
            int mid = start + (end - start) / 2;
            if(nums[mid] > target){
                end = mid;
            }else {
                start = mid;
            }
        }

        if(nums[start] == target){
            return start;
        }
        if(nums[end] == target){
            return end;
        }
        return -1;
    }
}
