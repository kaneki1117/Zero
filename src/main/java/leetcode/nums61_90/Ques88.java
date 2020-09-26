package leetcode.nums61_90;

import q_util.PrintUtil;

public class Ques88 {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1, 3 , nums2, 3);
        PrintUtil.printArray(nums1);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if ( nums1 == null || nums2 == null) return;

        int lenA = nums1.length - 1;
        int lenB = n - 1;
        int indexA = m - 1;

        int i = lenA;
        for (; i >= 0 ; i--) {
            if(lenB < 0 || indexA < 0) break;

            if (nums1[indexA] <= nums2[lenB]) {
                nums1[i] = nums2[lenB--];
            } else {
                nums1[i] = nums1[indexA--];
            }
        }

        while (lenB >= 0) {
            nums1[i--] = nums2[lenB--];
        }

    }

}
