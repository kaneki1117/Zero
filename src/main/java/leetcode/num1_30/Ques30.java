package leetcode.num1_30;

import java.util.*;

public class Ques30 {

    public static void main(String[] args) {
        String[] strs = {"bar", "foo"};
        String s = "barfoothefoobarman";
        List<Integer> list = findSubstring(s, strs);
        System.out.println(list);
    }

    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> list = new ArrayList<>();
        if (s == null || s.length() == 0 || words == null || words.length == 0) return list;

        int len = s.length();
        int wordLen = words[0].length();
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            }else {
                map.put(word, 1);
            }
        }

        int wordsLens = wordLen * words.length;
        for (int i = 0; i < len - wordsLens; i++) {
            Map<String, Integer> tempMap = new HashMap<>(map);

            int j = 0;
            for (; j < words.length ; j++) {
                String str = s.substring(i+ j * wordLen, i + (j+1)* wordLen);
                if(!tempMap.containsKey(str)){
                    break;
                }

                tempMap.put(str, map.get(str) - 1);
                if(tempMap.get(str) == 0) tempMap.remove(str);

                if(j == words.length - 1 && tempMap.isEmpty()){
                    list.add(i);
                    break;
                }
            }
        }


        return list;

    }
}
