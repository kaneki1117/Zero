package leetcode.num1_30;

import java.util.HashMap;
import java.util.Map;

public class Ques3 {

    public static void main(String[] args) {
        String str = "abba";
        String str1 = "bbbbb";
        String str2 = "abcdef";
        System.out.println(lengthOfLongestSubstring(str));
        System.out.println(lengthOfLongestSubstring(str1));
        System.out.println(lengthOfLongestSubstring(str2));
    }

    public static int lengthOfLongestSubstring(String s) {

        if (s == null || s.length() == 0) return 0;

        Map<Character, Integer> map = new HashMap<>();
        int length = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                start = Math.max(map.get(c) + 1, start);
            }
            map.put(c, i);
            length = Math.max(length, i - start + 1);
        }

        return length;

    }


}
