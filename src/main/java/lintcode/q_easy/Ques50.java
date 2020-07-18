package lintcode.q_easy;

import com.google.common.collect.Lists;
import q_util.PrintUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * 减少额外空间使用的做法 正序遍历一次后；倒序遍历一次 只需要
 */
public class Ques50 {
    public static void main(String[] args) {
        List<Integer> list = Lists.newArrayList(1,2,3,4);
        PrintUtil.printLongList(productExcludeItself(list));
    }


    public static List<Long> productExcludeItself(List<Integer> nums) {
        // write your code here
        if(nums == null || nums.size() == 0){
            return null;
        }
        List<Long> inOrder = new ArrayList<>();
        List<Long> reverse = new ArrayList<>();
        List<Long> result = new ArrayList<>();
        long inorder_sum = 1;
        long reverse_sum = 1;
        int length = nums.size();

        for (int i = 0; i < length; i++) {
            inOrder.add(inorder_sum);
            reverse.add(reverse_sum);
            inorder_sum *= nums.get(i);
            reverse_sum *= nums.get(length - 1 - i );
        }

        for (int i = 0; i < length; i++) {
            result.add( inOrder.get(i) *  reverse.get(length - 1 - i));
        }

        return result;


    }
}
