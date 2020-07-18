package lintcode.q_easy;

import q_util.PrintUtil;

public class Ques6 {

    public static void main(String[] args) {
        int[] A = null;
        int[] B = {2,3,5};
        int[] arr = mergeSortedArray(A, B);
        PrintUtil.printArray(arr);

    }

    public static int[] mergeSortedArray(int[] A, int[] B) {
        if(A == null || A.length == 0){
            return B;
        }
        if(B == null || B.length == 0){
            return A;
        }

        int Apoint = 0;
        int Bpoint = 0;
        int index = 0;
        int[] result = new int[A.length + B.length];
        while (Apoint < A.length && Bpoint < B.length ){
            if(A[Apoint] < B[Bpoint]){
                result[index++] = A[Apoint++];
            }else {
                result[index++] = B[Bpoint++];
            }
        }

        while (Apoint < A.length){
            result[index++] = A[Apoint++];

        }

        while (Bpoint < B.length){
            result[index++] = B[Bpoint++];
        }

        return result;
    }
}
