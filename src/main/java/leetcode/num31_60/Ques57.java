package leetcode.num31_60;

import q_util.PrintUtil;

import java.util.ArrayList;
import java.util.List;

//[1,3] [6,9] input [2,5] = [1,5] [6,9]
public class Ques57 {

    public static void main(String[] args) {
        int[][] intervals = {{1,3}, {6,9}};
        int[] news = {2,5};
        PrintUtil.print2DMatrix(insert(intervals, news));


    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals == null ) {
            return new int[0][0];
        }
        List<Pair> list = new ArrayList<>();
        List<Pair> result = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            list.add(new Pair(intervals[i][0], intervals[i][1]));
        }

        Pair newPair = new Pair(newInterval[0], newInterval[1]);

        int index = 0;
        for (; index < list.size(); index++) {
            if (list.get(index).right >= newPair.left) break;
            result.add(list.get(index));
        }

        while ( index < list.size() && list.get(index).left <= newPair.right) {
            newPair.left = Math.min(list.get(index).left, newPair.left);
            newPair.right = Math.max(list.get(index).right, newPair.right);
            index++;
        }

        result.add(newPair);

        while (index < list.size()) {
            result.add(list.get(index++));
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
