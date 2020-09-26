package leetcode.nums121_150;

public class Ques132 {

    public static void main(String[] args) {
        String str = "aab";
        System.out.println(minCut(str));

    }


    public static int minCut(String s) {
        if (s == null || s.length() == 0) return 0;
        //arr[i] 表示0~i 要切的最小次数
        int len = s.length();
        int[] arr = new int[len];
        boolean[][] pal = new boolean[len][len];


        for (int i = 0; i < len; i++) {
            arr[i] = i;
            for (int j = 0; j <= i; j++) {
                if(s.charAt(i) == s.charAt(j) && (j + 2 > i || pal[j+1][i-1])) {
                    pal[j][i] = true;
                    arr[i] = j == 0 ? 0 : (Math.min(arr[j - 1] + 1, arr[i]));
                }

            }
        }

        return arr[arr.length - 1];

    }

}
