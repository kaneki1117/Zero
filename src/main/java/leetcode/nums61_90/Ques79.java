package leetcode.nums61_90;

public class Ques79 {

    public static void main(String[] args) {

        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word1 = "ABCCED";
        String word2 = "SEE";
        String word3 = "ABCB";

        System.out.println(exist(board, word1));
        System.out.println(exist(board, word2));
        System.out.println(exist(board, word3));


    }


    public static boolean exist(char[][] board, String word) {

        if (word == null || word.length() == 0) return false;

        int m = board.length - 1;
        int n = board[0].length - 1;

        boolean[][] visit = new boolean[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (search(board, i, j, m, n, word, 0, visit)) return true;
            }
        }
        return false;
    }

    public static boolean search(char[][] board, int i, int j, int m, int n,
                                 String word, int index, boolean[][] visit) {
        if (index == word.length()) return true;

        if (i < 0 || i > m || j < 0 || j > n || visit[i][j] || board[i][j] != word.charAt(index)) {
            return false;
        }
        visit[i][j] = true;

        boolean res =
                (search(board, i + 1, j, m, n, word, index + 1, visit)
                        || search(board, i, j + 1, m, n, word, index + 1, visit)
                        || search(board, i - 1, j, m, n, word, index + 1, visit)
                        || search(board, i, j - 1, m, n, word, index + 1, visit)
                );
        visit[i][j] = false;
        return res;
    }
}
