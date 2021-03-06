package leetcode.num1_30;
//注意本题的顺序


import java.util.Stack;

public class Ques20 {

    public static void main(String[] args) {
        System.out.println(isValid("[()]"));
    }

    public static boolean isValid(String s) {
        if(s == null || s.trim().length() == 0) return true;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '[' || s.charAt(i) == '(' || s.charAt(i) == '{'){
                stack.push(s.charAt(i));
            }
            else{
                if(stack.isEmpty()) return false;
                if(s.charAt(i) == ']' && stack.pop() != '[') return false;
                if(s.charAt(i) == ')' && stack.pop() != '(') return false;
                if(s.charAt(i) == '}' && stack.pop() != '{') return false;
            }
        }

        return stack.isEmpty();
    }
}
