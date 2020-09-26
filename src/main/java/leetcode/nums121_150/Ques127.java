package leetcode.nums121_150;

import com.google.common.collect.Lists;

import java.util.*;

public class Ques127 {

    public static void main(String[] args) {
        String begin = "hit";
        String end = "cog";
        List<String> list = Lists.newArrayList("hot","dot","dog","lot","log","cog");
        System.out.println(ladderLength(begin,end,list));
    }




    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (beginWord.equals(endWord)) return 1;
        if (wordList == null || wordList.size() == 0) return 0;

        Set<String> set = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);

        int len = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                String str = queue.poll();
                for (String word : wordList) {
                    if (set.contains(word)) continue;
                    if (canGet(str, word)) {
                        if(word.equals(endWord)) return len+1;
                        queue.offer(word);
                        set.add(word);
                    }
                }
            }

            len++;
        }

        return  0;

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
