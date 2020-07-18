package leetcode.num31_60;


import java.util.*;

public class Ques49 {

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(strs);
        System.out.println();
    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<>();
        if(strs == null || strs.length == 0) return result;
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs) {
            String tempStr = sortAndConcat(s);
            if(!map.containsKey(tempStr)) {
                map.put(tempStr, new ArrayList<>());
            }

            map.get(tempStr).add(s);
        }

        for(List<String> list : map.values()) {
            result.add(list);
        }
        return result;

    }


    private static String sortAndConcat(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);

        return String.valueOf(arr);
    }
}
