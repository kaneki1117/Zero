package leetcode.nums91_120;

import q_util.PrintUtil;

import java.util.ArrayList;
import java.util.List;

public class Ques119 {

    public static void main(String[] args) {
        PrintUtil.printIntList(getRow(5));
    }

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        if (rowIndex <= 0 ) return result;

        int[] arr = new int[rowIndex + 1];
        arr[0] = 1;


        for (int i = 1; i <= rowIndex; i++) {
            for (int j = i; j >= 1 ; j--) {
                arr[j] = arr[j] + arr[j-1];
            }
        }

        for (int i : arr) {
            result.add(i);
        }

        return result;
    }
}
