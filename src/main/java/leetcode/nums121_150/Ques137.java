package leetcode.nums121_150;

public class Ques137 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1,2,1};
        System.out.println(singleNumber(arr));
    }

    public static int singleNumber(int[] nums) {
        if(nums == null || nums.length == 0) return 0;

        int res = 0;
        for (int i = 0; i < 32; i++) {
            int sum = 0;
            for(int num : nums) {
               sum += ( num >> i ) & 1;
            }

            res += (sum % 3) << i;

        }

        return res;

    }
}
