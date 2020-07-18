package leetcode.num31_60;

import java.util.Stack;

public class Ques32 {


    public static void main(String[] args) {

        String s = "(()";
        System.out.println(longestValidParentheses(s));
        String s1 = "()()";
        System.out.println(longestValidParentheses(s1));
        String s2 = "))((";
        System.out.println(longestValidParentheses(s2));
        String s3 = ")())()))";
        System.out.println(longestValidParentheses(s3));
    }



    public static int longestValidParentheses(String s) {

        if (s == null || s.length() == 0) return 0;

        Stack<Integer> stack = new Stack<>();

        char[] arr = s.toCharArray();

        int start = 0;
        int res = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == '(') {
                stack.push(i);
            }else {
                if(stack.isEmpty()){
                    start = i+1;
                } else {
                    stack.pop();
                    res = Math.max( res ,stack.empty() ? i - start + 1 : i - stack.peek());
                }

            }
        }


        return res;


    }

    /*public static int longestValidParentheses(String s) {

        if (s == null || s.length() == 0) return 0;

        int leftCnt = 0;
        int rightCnt = 0;


        char[] arr = s.toCharArray();

        int maxLen = 0;
        int len = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == '(') {
                leftCnt++;
            } else {
                rightCnt++;
            }

            if (rightCnt > leftCnt) {
                maxLen = Math.max(maxLen, (len / 2) * 2);
                leftCnt = 0;
                rightCnt = 0;
                len = 0;
                continue;
            } else {
                maxLen = Math.max(maxLen, rightCnt * 2);
            }

            len++;
        }

        return maxLen;


    }*/
}
