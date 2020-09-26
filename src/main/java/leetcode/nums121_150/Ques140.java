package leetcode.nums121_150;

import q_util.PrintUtil;

import java.util.*;

//写的方法TLE了，未能AC。应该考虑更为easy的思路。
public class Ques140 {

    public static void main(String[] args) {
        //String s = "catsanddog";
        String s = "leetcode";
        List<String> list = new ArrayList<>();
      /*  list.add("cat");
        list.add("cats");
        list.add("and");
        list.add("sand");
        list.add("dog");*/

        list.add("leet");
        list.add("code");

        List<String> strings = wordBreak(s, list);
        PrintUtil.printStringList(strings);
    }


    public static List<String> wordBreak(String s, List<String> wordDict) {
        List<String> result = new ArrayList<>();
        if (s == null || s.length() == 0) {
            return result;
        }
        Set<String> wordSet = new HashSet<>();
        for (String word : wordDict) {
            wordSet.add(word);
        }

        return wordBreak(s, wordSet);


    }

    public static List<String> wordBreak(String s, Set<String> wordDict) {
        return DFS(s, wordDict, new HashMap<String, LinkedList<String>>());
    }

    // DFS function returns an array including all substrings derived from s.
    static List<String> DFS(String s, Set<String> wordDict, HashMap<String, LinkedList<String>> map) {
        if (map.containsKey(s))
            return map.get(s);

        LinkedList<String> res = new LinkedList<String>();
        if (s.length() == 0) {
            res.add("");
            return res;
        }
        for (String word : wordDict) {
            if (s.startsWith(word)) {
                List<String> sublist = DFS(s.substring(word.length()), wordDict, map);
                for (String sub : sublist)
                    res.add(word + (sub.isEmpty() ? "" : " ") + sub);
            }
        }
        map.put(s, res);
        return res;
    }




    /*public static List<String> wordBreak(String s, List<String> wordDict) {
        List<String> result = new ArrayList<>();
        if(s == null || s.length() == 0) {
            return result;
        }
        Set<String> wordSet = new HashSet<>();
        for(String word : wordDict) {
            wordSet.add(word);
        }

        List<List<String>> restoreRes = new ArrayList<>();
        helper(0, s , new ArrayList(), wordSet, restoreRes);
        for(List<String> list : restoreRes) {
            String str = "";
            for(String temp : list) {
                str += temp +" ";
            }
            str = str.substring(0, str.length() -1);
            result.add(str);
        }

        return result;
    }

    private static void helper(int index, String s, List<String> list, Set<String> wordSet, List<List<String>> restoreRes) {
        if (s.length() == index) {
            restoreRes.add(new ArrayList<>(list));
            return;
        }

        for (int i = index + 1 ; i <= s.length() ; i++) {
            String subStr = s.substring(index, i);
            if(!wordSet.contains(subStr)) continue;
            list.add(subStr);
            helper(i , s, list, wordSet, restoreRes );
            list.remove(list.size()-1);
        }

    }
*/

}
