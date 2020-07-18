package leetcode.num31_60;

import java.util.*;
//这种 去重的思路 太赞！


public class Ques36 {

    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        System.out.println(isValidSudoku(board));

    }

    public static boolean isValidSudoku(char[][] board) {

        if (board == null || board.length != 9 || board[0].length != 9) return false;

        Set<String> set = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char charc = board[i][j];
                if (charc == '.') continue;

                if (!set.add(charc + " in row " + i) ||
                        !set.add(charc + " in col " + j) ||
                        !set.add(charc + " in cub " + i / 3 + "-" + j / 3)) {
                    return false;
                }
            }
        }
        return true;
    }

    /*public static boolean isValidSudoku(char[][] board) {

        if (board == null || board.length != 9 || board[0].length != 9) return false;

        Set<Character> left = new HashSet<>();
        Set<Character> mid = new HashSet<>();
        Set<Character> right = new HashSet<>();
        Set<Character> lineSet = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0) {
                left.clear();
                mid.clear();
                right.clear();
            }
            lineSet.clear();
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c == '.') continue;

                if (lineSet.contains(c)) return false;
                if (j / 3 == 0 && left.contains(c)) return false;
                if (j / 3 == 1 && mid.contains(c)) return false;
                if (j / 3 == 2 && right.contains(c)) return false;


                lineSet.add(c);
                if (j / 3 == 0) {
                    left.add(c);
                } else if (j / 3 == 1) {
                    mid.add(c);
                } else {
                    right.add(c);
                }

            }

        }

        return true;

    }*/
}
