package leetcode.nums121_150;

import java.util.Arrays;

//记住这种解决问题的思路
public class Ques135 {

    public static void main(String[] args) {

        int[] arr = {1,2,3,1};
        int[] arr2 = {2,0,1};
        System.out.println(candy(arr));
        System.out.println(candy(arr2));

    }

    public static int candy(int[] ratings) {
        if (ratings == null || ratings.length == 0) return -1;

        int[] res = new int[ratings.length];
        Arrays.fill(res , 1);
        for (int i = 1; i < ratings.length; i++) {
            if(ratings[i] > ratings[i-1]) {
                res[i] = res[i-1] + 1;
            }
        }

        for (int i = ratings.length - 2; i >= 0; i--) {
            if(ratings[i] > ratings[i+1]) {
                res[i] = Math.max(res[i+1] + 1,res[i] );
            }
        }
        int result = 0;

        for(int num : res) {
            result += num;
        }

        return result;

    }
}
