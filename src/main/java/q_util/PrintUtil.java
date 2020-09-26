package q_util;

import java.util.List;

public class PrintUtil {

    public static void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i +", ");
        }
        System.out.println();
    }

    public static void printArray(char[] arr){
        for(char c : arr){
            System.out.print(c +", ");
        }
    }

    public static void printIntList(List<Integer> list){
        for(Integer i : list){
            System.out.print(i + ",");
        }
    }

    public static void printLongList(List<Long> list){
        for(Long i : list){
            System.out.print(i + ",");
        }
    }

    public static void printStringList(List<String> list){
        for(String str : list){
            System.out.print(str + ",");
        }
    }

    public static void print2DMatrix(int[][] matrix) {
        int m  = matrix.length;
        int n  = matrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
