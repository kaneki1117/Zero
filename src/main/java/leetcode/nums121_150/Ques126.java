package leetcode.nums121_150;

import com.google.common.collect.Lists;

import java.util.*;
// 可以优化的点：canGet 方法 wordList -> wordSet，直接字母change后，查找set是否存在
public class Ques126 {

    public static void main(String[] args) {
        String begin = "hit";
        String end = "cog";
        List<String> list = Lists.newArrayList("hot", "dot", "dog", "lot", "log", "cog");
        System.out.println(findLadders(begin, end, list));
    }

    public static List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> result = new ArrayList<>();
        if (wordList == null || wordList.size() == 0) return result;
        Set<String> tempSet = new HashSet<>();
        for (String word : wordList) {
            tempSet.add(word);
        }
        if (!tempSet.contains(endWord)) return result;


        Map<String, Integer> distance = new HashMap<>();
        Map<String, List<String>> partners = new HashMap<>();
        List<String> paths = new ArrayList<>();

        if (!wordList.contains(beginWord)) {
            wordList.add(beginWord);

        }

        bfs(endWord, wordList, distance, partners);

        dfs(beginWord, endWord, distance, partners, paths, result);


        return result;


    }

    private static void dfs(String curt, String endWord, Map<String,Integer> distance,
                            Map<String,List<String>> partners, List<String> paths, List<List<String>> result) {

        paths.add(curt);
        if (curt.equals(endWord)) {
            result.add(new ArrayList<>(paths));
        } else {
            for (String partner : partners.get(curt)) {
                if(distance.containsKey(partner) && distance.get(curt) == distance.get(partner) + 1) {
                    dfs(partner, endWord, distance, partners, paths, result);
                }
            }
        }

        paths.remove(paths.size()-1);

    }

    private static void bfs(String endWord, List<String> wordList, Map<String, Integer> distance, Map<String, List<String>> map) {

        Queue<String> queue = new LinkedList<>();
        queue.add(endWord);
        distance.put(endWord, 0);

        for (String word : wordList) {
            map.put(word, new ArrayList<>());
        }

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String str = queue.poll();
                for (String word : wordList) {
                    if (canGet(str, word)) {
                        map.get(word).add(str);
                        if (distance.containsKey(word)) {
                            continue;
                        }
                        distance.put(word, distance.get(str) + 1);
                        queue.offer(word);
                    }
                }

            }

        }
    }


    public static boolean canGet(String src, String dst) {
        if (src.length() != dst.length()) return false;

        int count = 0;

        for (int i = 0; i < src.length(); i++) {
            if (src.charAt(i) != dst.charAt(i)) count++;
        }

        return count == 1;

    }
}
