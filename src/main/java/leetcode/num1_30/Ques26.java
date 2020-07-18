package leetcode.num1_30;

public class Ques26 {

    public static void main(String[] args) {
        int[] arr = {0,1,1,2,3,4,5};
        System.out.println(removeDuplicates(arr));
    }

    public static int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != nums[index]){
                nums[++index] = nums[i];
            }
        }

        return index + 1;

    }



}
