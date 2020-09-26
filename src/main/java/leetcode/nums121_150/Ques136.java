package leetcode.nums121_150;

public class Ques136 {

    public static void main(String[] args) {
        int[] arr = {1,2,4,1,2};
        System.out.println(singleNumber(arr));

    }

    public static int singleNumber(int[] nums) {
        if(nums == null || nums.length == 0) return 0;

        int res = 0;

        for(int num : nums) {
            res = res ^ num;
        }

        return res;

    }
}
