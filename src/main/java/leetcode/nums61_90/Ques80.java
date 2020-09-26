package leetcode.nums61_90;

//0 0 0 1 1 2 2 2 3
//0 0 1 0 1 2
public class Ques80 {

    public static void main(String[] args) {
        int[] arr = {0,0,0,1,1,2,2,2,3};
        System.out.println(removeDuplicates(arr));
    }

    public static int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return 0;

        int left = 0;
        int index = 1;
        int cnt = 1;

        while (index < nums.length) {
            if(nums[left] == nums[index] && cnt == 0 ) {
                index++;
            } else {
                if(nums[left] == nums[index]) {
                    cnt--;
                } else {
                    cnt = 1;
                }
                nums[++left] = nums[index++];
            }

        }

        return left+1;

    }



}
