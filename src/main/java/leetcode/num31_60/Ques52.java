package leetcode.num31_60;

import java.util.ArrayList;
import java.util.List;

public class Ques52 {

    public static void main(String[] args) {
        System.out.println(totalNQueens(1));
    }


    public static int totalNQueens(int n) {

        List<List<String>> result = new ArrayList<>();
        if (n <= 0) return 0;

        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(".");
        }
        for (int i = 0; i < n; i++) {
            list.add(sb.toString());
        }
        helper(0, n, list, result);

        return result.size();
    }

    private static void helper(int index, int n, List<String> list, List<List<String>> result) {
        if (index == n) {
            result.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!isValid(index, i, list)) {
                continue;
            }
            char[] chars = list.get(index).toCharArray();
            chars[i] = 'Q';
            list.set(index, String.valueOf(chars));
            helper(index + 1, n, list, result);
            chars = list.get(index).toCharArray();
            chars[i] = '.';
            list.set(index, String.valueOf(chars));
        }

    }


    private static boolean isValid(int index , int i , List<String> list) {
        for(String s : list) {
            if(s.charAt(i) == 'Q') return false;
        }
        int tempi = i;
        for (int j = index - 1; j >= 0 && tempi > 0 ; j--) {
            if(list.get(j).charAt(--tempi) =='Q') return false;
        }
        int tempi2 = i;
        for (int j = index - 1; j >= 0 && tempi2 < list.size() - 1 ; j--) {
            if(list.get(j).charAt(++tempi2) =='Q') return false;
        }
        return true;
    }
}
