package leetcode.num1_30;

public class Ques11 {

    public int maxArea(int[] height) {
        if(height == null || height.length < 2) return -1;
        int left = 0; int right = height.length - 1;
        int max = 0;
        while (left < right){
            int res = (right - left ) * Math.min(height[left], height[right]);
            max = Math.max(res , max);

            if(height[left] <height[right]){
                left++;
            }else {
                right--;
            }

        }
        return max;

    }


    public static void main(String[] args) {

    }
}
