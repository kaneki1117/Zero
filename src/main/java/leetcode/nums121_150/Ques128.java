package leetcode.nums121_150;

import java.util.HashSet;
import java.util.Set;
//没有思路！
public class Ques128 {

    public static void main(String[] args) {
        int[] arr = {2,3,100,200,1,4};
        System.out.println(longestConsecutive(arr));
    }

    public static int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return -1;

        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);
        int result = 0;
        int left, right;

        for (int num : nums) {
            if (!set.contains(num)) continue;
            left = num - 1;
            right = num + 1;
            while (set.contains(left)) {
                set.remove(left);
                left--;
            }
            while (set.contains(right)) {
                set.remove(right);
                right++;
            }
            result = Math.max(result,right - left - 1);

        }

        return result;


    }


}
