package leetcode.num31_60;

/*
* 未做出 后续继续做。
* */
public class Ques37 {

    public void solveSudoku(char[][] board) {
        if(board == null || board.length != 9 || board[0].length != 9) return;

        helper(board , 0 , 0);

    }


    public boolean helper(char[][] board, int i ,int j) {
        if(i == 9) return true;
        if(j == 9) return helper(board, i+ 1, 0);

        if(board[i][j] != '.') return helper(board, i, j+ 1);

        for(char c = '1'; c <= '9' ; c++) {

            if(!isValid(board, i , j , c)) continue;
            board[i][j] = c;
            if(helper(board, i , j + 1)) return true;
            board[i][j] = '.';
        }

        return false;

    }


    public boolean isValid(char[][] board, int i ,int j, char val) {
        for (int x = 0; x < 9; ++x) {
            if (board[x][j] == val) return false;
        }
        for (int y = 0; y < 9; ++y) {
            if (board[i][y] == val) return false;
        }
        int row = i - i % 3, col = j - j % 3;
        for (int x = 0; x < 3; ++x) {
            for (int y = 0; y < 3; ++y) {
                if (board[x + row][y + col] == val) return false;
            }
        }
        return true;

    }


}
