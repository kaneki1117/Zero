package leetcode.num1_30;

import java.util.ArrayList;
import java.util.List;

public class Ques17 {

    public static void main(String[] args) {
        String digits = "23";
        System.out.println(letterCombinations(digits));
    }

    public static final String[] numList = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits == null || digits.trim().length() == 0) return result;

        helper(digits , 0 , "", result );

        return result;

    }

    public static void helper(String digits, int index, String str, List<String> result){
        if(index == digits.length()){
            result.add(str);
            return;
        }

        int num = digits.charAt(index) - '0';
        for (int i = 0; i < numList[num].length(); i++) {
            helper(digits, index + 1, str+numList[num].charAt(i) , result);

        }

    }
}
