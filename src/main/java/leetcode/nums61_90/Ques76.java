package leetcode.nums61_90;

import java.util.HashMap;
import java.util.Map;

/**
 * 较复杂 多做几次
 */
public class Ques76 {

    public static void main(String[] args) {
        String S = "ADBANC";
        String T = "ABC";
        System.out.println(minWindow(S, T));
    }


    public static String minWindow(String s, String t) {
        if (s == null || s.length() == 0 || t == null || t.length() == 0) return "";

        Map<Character,Integer> map = new HashMap<>();
        for(char c : t.toCharArray()) {
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        int minLen = s.length() + 1;
        int minLeft = 0;
        int left = 0;
        int cnt = 0;


        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                if(map.get(s.charAt(i)) >= 0) {
                    cnt++;
                }
            }

            while (cnt == t.length()) {
                if( minLen > i - left + 1) {
                    minLeft = left;
                    minLen = i - left + 1;
                }

                if(map.containsKey(s.charAt(left))) {
                    map.put(s.charAt(left), map.get(s.charAt(left)) + 1);
                    if(map.get(s.charAt(left)) > 0) {
                        cnt--;
                    }
                }
                left++;
            }
        }

        if ( minLen > s.length()) {
            return "";
        }

        return s.substring(minLeft, minLeft + minLen);


    }

}
