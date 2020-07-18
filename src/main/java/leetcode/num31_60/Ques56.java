package leetcode.num31_60;

import q_util.PrintUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ques56 {


    public static void main(String[] args) {
        int[][] arr = {{1,4},{4,5}};
        PrintUtil.print2DMatrix(merge(arr));
    }

    public static int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0 || intervals[0].length == 0) {
            return new int[0][0];
        }
        List<Pair> list = new ArrayList<>();
        List<Pair> result = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            list.add(new Pair(intervals[i][0], intervals[i][1]));
        }
        Collections.sort(list);
        result.add(list.get(0));

        for (int i = 1; i < list.size(); i++) {
            int tempR = result.get(result.size() - 1).right;
            if (list.get(i).left <= tempR) {
                result.get(result.size() - 1).right = Math.max(tempR, list.get(i).right);
            } else {
                result.add(list.get(i));
            }
        }

        int[][] res = new int[result.size()][2];

        for (int i = 0; i < result.size(); i++) {
            res[i][0] = result.get(i).left;
            res[i][1] = result.get(i).right;
        }

        return res;


    }


    public static class Pair implements Comparable<Pair> {
        int left;
        int right;

        public Pair(int left, int right) {
            this.left = left;
            this.right = right;
        }

        @Override
        public int compareTo(Pair o) {
            return this.left - o.left;
        }
    }
}
