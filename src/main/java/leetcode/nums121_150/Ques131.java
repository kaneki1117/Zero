package leetcode.nums121_150;

import java.util.ArrayList;
import java.util.List;

public class Ques131 {

    public static void main(String[] args) {

        String str = "aab";
        List<List<String>> partition = partition(str);
        System.out.println();
    }

    public static List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        if (s == null || s.length() == 0) return result;

        helper(s, 0, new ArrayList<>(), result);
        return result;

    }

    private static void helper(String s, int index, List<String> list, List<List<String>> result) {
        if (index == s.length()) {
            result.add(new ArrayList<>(list));
            return;
        }

        for (int i = index + 1; i <= s.length(); i++) {
            String str = s.substring(index, i);
            if (!isValid(str)) {
                continue;
            }
            list.add(str);
            helper(s, i , list, result);
            list.remove(list.size() - 1);
        }
    }


    public static boolean isValid(String str) {
        int l = 0;
        int r = str.length() - 1;
        while (l < r) {
            if (str.charAt(l) != str.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }


}
