package lintcode.q_easy;

import com.google.common.collect.Lists;

import java.util.List;

public class Ques39 {

    public static void main(String[] args) {
        List<Integer> nums = Lists.newArrayList(1);
        recoverRotatedSortedArray(nums);
        for(Integer i : nums){
            System.out.print(i +",");
        }
    }

    public static void recoverRotatedSortedArray(List<Integer> nums) {
        // write your code here
        if(nums == null || nums.size() == 0){
            return;
        }

        int start = 0 ; int end = nums.size() - 1;
        int mid;
        int min;
        while (start + 1 < end){
            mid = (end - start) / 2 + start;
            if(nums.get(mid) < nums.get(end)){
                end = mid;
            }else if(nums.get(mid) == nums.get(end)){
                end = end - 1;
            }else {
                start = mid;
            }
        }
        if(nums.get(start) < nums.get(end)){
            min = start;
        }else {
            min = end;
        }

        //注意这里
        swap(nums, 0 ,Math.max(0, min -1));
        swap(nums, min , nums.size() - 1);
        swap(nums , 0 , nums.size() - 1);
    }

    public static void swap(List<Integer> nums, int start , int end){
        while (start < end){
            int temp = nums.get(start);
            nums.set(start, nums.get(end));
            nums.set(end , temp);
            start++;
            end--;
        }
    }
}
