package leetcode.nums61_90;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ques77 {

    public static void main(String[] args) {
        List<List<Integer>> result = combine(4,2);
        System.out.println(result);


    }

    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        if (n <= 0) return result;

        helper(1, n, k, new ArrayList<Integer>(), new HashSet<Integer>(), result);

        return result;

    }

    private static void helper(int index, int n, int k, List<Integer> arr, Set<Integer> set, List<List<Integer>> result) {
        if(arr.size() == k) {
            result.add(new ArrayList<>(arr));
            return;
        }

        for(int i = index ; i <= n; i++) {
            arr.add(i);
            set.add(i);
            helper(i+1, n , k ,arr ,set , result);
            arr.remove(arr.size()-1);
            set.remove(i);

        }


    }
}
