package leetcode.num1_30;

public class Ques27 {

    public static int removeElement(int[] nums, int val) {
        if(nums == null || nums.length == 0 ) return 0;

        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == val){
                continue;
            }
            nums[index++] = nums[i];
        }

        return index;

    }

    public static void main(String[] args) {

        int[] arr = {3,2,2,3};
        int val = 3;
        System.out.println(removeElement(arr, val));
    }
}
