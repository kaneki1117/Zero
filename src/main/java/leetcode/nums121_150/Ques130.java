package leetcode.nums121_150;

import java.util.Arrays;
//不难 写起来容易出错。
public class Ques130 {

    public static void main(String[] args) {
        /*char[][] board = {{'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'}};
*/
        char[][] board = {{'O','O','O'},{'O','O','O'},{'O','O','O'}};

        solve(board);
        System.out.println();
    }

    public static void solve(char[][] board) {
        if (board == null || board.length == 0 || board[0].length == 0) {
            return;
        }
        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < n; i++) {
            if (board[0][i] == 'O') {
                bfs(board, 0, i, m, n);
            }
            if (board[m - 1][i] == 'O') {
                bfs(board, m - 1, i, m, n);
            }
        }

        for (int i = 0; i < m; i++) {
            if (board[i][0] == 'O') {
                bfs(board, i, 0, m, n);
            }

            if (board[i][n - 1] == 'O') {
                bfs(board, i, n - 1, m, n);
            }
        }


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'S') {
                    board[i][j] = 'O';
                } else {
                    board[i][j] = 'X';
                }
            }
        }

    }

    private static void bfs(char[][] board, int i, int j, int m, int n) {
        if (i < 0 || i > m - 1 || j < 0 || j > n - 1 || board[i][j] != 'O') return;

        if (board[i][j] == 'O') {
            board[i][j] = 'S';
            bfs(board, i + 1, j, m, n);
            bfs(board, i - 1, j, m, n);
            bfs(board, i, j + 1, m, n);
            bfs(board, i, j - 1, m, n);
        }

    }

}
