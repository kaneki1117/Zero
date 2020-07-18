package leetcode.nums61_90;

import q_util.PrintUtil;

public class Ques66 {

    public static void main(String[] args) {
        int[] arr = {9,9};
        PrintUtil.printArray(plusOne(arr));

    }

    public static int[] plusOne(int[] digits) {
        if(digits == null || digits.length == 0) return null;


        int carry = 1;
        for (int i = digits.length - 1; i >= 0 ; i--) {
            digits[i] = digits[i]+ carry;
            carry = digits[i] / 10;
            digits[i] = digits[i] % 10;
        }

        if ( carry == 1) {
            int[] arr = new int[digits.length + 1];
            arr[0] = 1;
            for (int i = 1; i < arr.length; i++) {
                arr[i] = digits[i-1];
            }

            return arr;
        }

        return digits;


    }
}

