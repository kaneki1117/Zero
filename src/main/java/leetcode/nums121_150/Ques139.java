package leetcode.nums121_150;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//思考点： helper函数 要处理空串 所以要加1
public class Ques139 {

    public static void main(String[] args) {
        String s = "catsandog";
        List<String> list = new ArrayList<>();
        list.add("cats");
        list.add("and");
        list.add("dog");
        System.out.println(wordBreak(s, list));

    }

    public static boolean wordBreak(String s, List<String> wordDict) {

        if (s == null || s.length() == 0) return false;

        Set<String> wordSet = new HashSet<>();
        for(String word : wordDict) {
            wordSet.add(word);
        }

        boolean[] helper = new boolean[s.length() + 1];
        helper[0] = true;

        for (int i = 1; i < helper.length; i++) {
            for (int j = 0; j < i ; j++) {
                String str = s.substring(j,i);
                if(helper[j] && wordSet.contains(str)) {
                    helper[i] =true;
                    break;
                }
            }


        }

        return helper[helper.length- 1];


    }
}
