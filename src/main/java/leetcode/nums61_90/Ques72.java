package leetcode.nums61_90;

public class Ques72 {

    public static void main(String[] args) {

        String word1 = "intention";
        String word2 = "execution";
        System.out.println(minDistance(word1, word2));

    }

    public static int minDistance(String word1, String word2) {

        if(word1 == null || word1.length() == 0) {
            if(word2 == null || word2.length() == 0) {
                return 0;
            }else {
                return word2.length();
            }
        }

        if(word2 == null || word2.length() == 0) {
            return word1.length();
        }

        int len1 = word1.length();
        int len2 = word2.length();

        int[][] matrix = new int[len1+1][len2+1];

        for (int i = 1; i <= len1; i++) {
            matrix[i][0] = i;
        }

        for (int i = 1; i <= len2; i++) {
            matrix[0][i] = i;
        }


        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2 ; j++) {
                if(word1.charAt(i-1) == word2.charAt(j-1)) {
                    matrix[i][j] = matrix[i-1][j-1];
                } else {
                    matrix[i][j] = Math.min(Math.min(matrix[i][j-1],matrix[i-1][j]),matrix[i-1][j-1]) + 1;
                }
            }
        }

        return matrix[len1][len2];


    }


}
