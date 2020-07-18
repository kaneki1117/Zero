package leetcode.num1_30;

// K - k/ 2
public class Ques4 {

    public static void main(String[] args) {
        int[] num1 = {1,2};
        int[] num2 = {3,4};
        System.out.println(findMedianSortedArrays(num1, num2));

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1 == null || nums2 == null )
            return -1;
        int m = nums1.length;
        int n = nums2.length;
        double res;
        int k = (m + n) / 2;
        if( (m + n) % 2 == 0){
            res = (findK(nums1 , nums2 , 0, 0, k) + findK(nums1 , nums2 , 0, 0, k+1))/2.0;
        }else {
            res = findK(nums1 , nums2 , 0, 0, k + 1);
        }

        return res;
    }

    public static double findK(int[] nums1 , int[] nums2, int start_1, int start_2 , int k ){
        if(start_1 >= nums1.length){
            return nums2[start_2 + k -1];
        }
        if(start_2 >= nums2.length){
            return nums1[start_1 + k -1];
        }

        if( k == 1){
            return Math.min(nums1[start_1], nums2[start_2]);
        }

        int A = Integer.MAX_VALUE;
        int B = Integer.MAX_VALUE;
        if(start_1 + k /2 - 1 < nums1.length){
            A = nums1[start_1 + k /2 - 1];
        }

        if(start_2 + k /2 - 1 < nums2.length){
            B = nums2[start_2 + k /2 - 1];
        }

        if(A < B){
            return findK(nums1, nums2, start_1 + k /2 ,start_2, k - k /2);
        }else {
            return findK(nums1, nums2, start_1  ,start_2 + k /2, k - k /2);

        }



    }
}
