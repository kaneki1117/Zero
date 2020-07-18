package lintcode.q_easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ques55 {
    public static void main(String[] args) {
        System.out.println(compareStrings("ABCD","AABC"));
    }


    public static boolean compareStrings(String A, String B) {
        // write your code here
        if((A == null || A.length() == 0) && B.length() > 0 ) return false;
        if(B == null || B.length() == 0) return true;

        char[] arrA = A.toCharArray();
        char[] arrB = B.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : arrA){
            if(!map.containsKey(c)){
                map.put(c, 1);
            }else {
                map.put(c, map.get(c)+1);
            }
        }

        for (char c : arrB){
            if(!map.containsKey(c)){
                return false;
            }else {
                if(map.get(c) == 0) return false;
                map.put(c ,map.get(c) -1);
            }

        }

        return true;
    }
}
