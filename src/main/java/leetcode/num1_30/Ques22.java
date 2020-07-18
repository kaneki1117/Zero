package leetcode.num1_30;

import java.util.ArrayList;
import java.util.List;

public class Ques22 {

    public static void main(String[] args) {
        List<String> res= generateParenthesis(1);
        System.out.println();
    }



    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        if( n < 0) return list;

        helper(n,n, "", list);

        return list;

    }

    public static void helper(int left, int right, String str, List<String> res){
        if(left == 0 && right == 0){
            res.add(str);
            return;
        }

        if(left < 0 || right < 0 || left > right) return;

        helper(left - 1, right, str+"(", res);
        helper(left , right - 1, str+")", res);
    }
}
