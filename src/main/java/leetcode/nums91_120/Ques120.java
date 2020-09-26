package leetcode.nums91_120;

import java.util.List;

public class Ques120 {

    public static void main(String[] args) {

    }
    public static int minimumTotal(List<List<Integer>> triangle) {
        if(triangle == null || triangle.size() == 0) return 0;

        int[] arr = new int[triangle.size()];
        List<Integer> last = triangle.get(triangle.size() - 1);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = last.get(i);
        }

        for(int j = triangle.size() - 2 ; j >= 0  ; j--) {
            List<Integer> list = triangle.get(j);
            for (int i = 0; i < list.size(); i++) {
                arr[i] = Math.min(arr[i],arr[i+1]) + list.get(i);
            }
        }

        return arr[0];


    }
}
