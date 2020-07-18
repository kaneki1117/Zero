package lintcode.q_easy;

public class Ques60 {

    //corner case 较多：相等时的位置。

    public static void main(String[] args) {
        int[] arr = {-1, 0 ,1 ,2 };
        System.out.println(searchInsert(arr, 2));

    }

    public static int searchInsert(int[] A, int target) {
        // write your code here
        if(A ==null || A.length == 0) return -1;

        int start = 0; int end = A.length - 1;
        while (start + 1 < end){
            int mid = (end - start) / 2 + start;
            if(A[mid] < target){
                start = mid;
            }else {
                end = mid;
            }
        }

        if(target <= A[start]){
            return start;
        }
        if( target <= A[end]){
            return end;
        }
        return end + 1;

    }
}
