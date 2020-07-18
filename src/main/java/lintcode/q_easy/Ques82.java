package lintcode.q_easy;

public class Ques82 {

    public static void main(String[] args) {
        int[] arr1 = {1,1,2,2,3,4,4};
        int[] arr2 = {0,0,1};
        System.out.println(singleNumber(arr1));
        System.out.println(singleNumber(arr2));
    }

    public static int singleNumber(int[] A) {
        // write your code here
        if(A == null || A.length == 0) return -1;

        int res = 0;

        for (int i = 0 ; i < A.length ; i++){
            res = res ^ A[i];
        }

        return res;
    }
}
