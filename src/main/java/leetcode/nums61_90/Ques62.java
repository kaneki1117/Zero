package leetcode.nums61_90;

import java.util.Arrays;

public class Ques62 {

    public static void main(String[] args) {

        System.out.println(uniquePaths(7,3));

    }

    public static int uniquePaths(int m, int n) {

        int[] count = new int[n];
        Arrays.fill(count, 1);
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                count[j] = count[j] + count[j - 1];
            }
        }

        return count[n-1];

    }
}
