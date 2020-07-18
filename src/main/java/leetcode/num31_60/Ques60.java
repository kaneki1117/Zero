package leetcode.num31_60;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//开始想用递归去做 实际上不需要
public class Ques60 {

    public static void main(String[] args) {
        System.out.println(getPermutation(3, 3));
    }

    public static String getPermutation(int n, int k) {

        int[] factor = new int[10];
        factor[0] = 1;
        for (int i = 1; i <= 9; i++) {
            factor[i] = factor[i-1] * i;
        }

        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
           nums.add(i);
        }

        k--;

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n ; i++) {
            int time = k / (factor[n - i]);
            sb.append(nums.get(time));
            nums.remove(time);
            k -= time * factor[n-i];
        }

        return sb.toString();






    }


}
