package leetcode.nums91_120;

import q_util.PrintUtil;

import java.util.ArrayList;
import java.util.List;

public class Ques118 {

    public static void main(String[] args) {
        List<List<Integer>> list = generate(3);
        for(List<Integer> l :  list) {
            PrintUtil.printIntList(l);
            System.out.println();
        }
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows <= 0) return  result;

        List<Integer> initList = new ArrayList<>();
        initList.add(1);
        result.add(initList);

        for (int i = 1; i < numRows; i++) {
            List<Integer> newList = new ArrayList<>();
            List<Integer> oldList = result.get(i-1);
            for (int j = 0; j <= oldList.size(); j++) {
                if(j == 0 || j == oldList.size()) {
                    newList.add(1);
                } else {
                    newList.add(oldList.get(j) + oldList.get(j-1));
                }
            }
            result.add(newList);

        }

        return result;

    }
}
