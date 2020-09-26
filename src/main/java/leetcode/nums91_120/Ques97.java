package leetcode.nums91_120;

//自己AC了 但是方法太差。应该用二维DP去做！！ 类似word break;


import java.util.*;

public class Ques97 {

    public static void main(String[] args) {
        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbcbcac";
        String s4 = "aadbbbaccc";
        System.out.println(isInterleave(s1, s2, s3));
        System.out.println(isInterleave(s1, s2, s4));
    }

    public static boolean isInterleave(String s1, String s2, String s3) {

        //
        if ( s1 == null || s2 == null || s3 == null ) return false;
        if ( s1.length() + s2.length() != s3.length()) return false;


        LinkedList<Pair> queue = new LinkedList<>();

        Map<Integer,Integer> map = new HashMap<>();
        queue.offer(new Pair(-1, -1));
        int index = 0;
        while (index < s3.length()) {
            if ( queue.isEmpty()) return false;

            while (!queue.isEmpty() && (queue.peek().left + queue.peek().right + 2 == index)) {
                Pair pair = queue.poll();
                if (map.containsKey(pair.left) && map.get(pair.left) == pair.right) {
                    continue;
                } else {
                    map.put(pair.left, pair.right);
                }
                int tempL = pair.left + 1;
                if( tempL < s1.length() && s1.charAt(tempL) == s3.charAt(index)) {
                    queue.offer(new Pair(tempL, pair.right));
                }

                int tempR = pair.right + 1;
                if( tempR < s2.length() && s2.charAt(tempR) == s3.charAt(index)) {
                    queue.offer(new Pair(pair.left, tempR));
                }
            }
            index++;
        }

        return !queue.isEmpty() && index == s3.length();


    }

    public static class Pair {
        int left;
        int right;

        public Pair(int left, int right) {
            this.left = left;
            this.right = right;
        }

    }

}
