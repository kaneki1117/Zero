package lintcode.q_easy;

//倒过来判断！！
public class Ques64 {
    public static void main(String[] args) {
        int[] A = {1,2,5,0,0};
        int[] B = {3,4};
    }


    public  void mergeSortedArray(int[] A, int m, int[] B, int n) {
        // write your code here
        if(A == null || A.length == 0) return;
        int i = m - 1;
        int j = n - 1;
        int k = m + n -1;
        while (i >= 0  && j >= 0){
            if(B[j] > A[i] ){
                A[k--] = B[j--];
            }else {
                A[k--] = A[i--];
            }
        }

        while (j >= 0) A[k--] =  B[j--];

    }
}
