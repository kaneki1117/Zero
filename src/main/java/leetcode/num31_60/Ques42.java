package leetcode.num31_60;

public class Ques42 {

    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(arr));

    }

    public static int trap(int[] height) {
        if(height == null || height.length == 0) return 0;

        int l = 0 ;
        int r = height.length - 1;
        int res = 0;

        while (l < r) {
            int min = Math.min(height[l], height[r]);

            if(min == height[l]) {
                l++;
                while (l < r && height[l] < min) {
                    res += min - height[l++];
                }

            }else {
                r--;

                while (r > l && height[r] < min) {
                    res += min - height[r--];
                }
            }

        }

        return res;

    }
}
