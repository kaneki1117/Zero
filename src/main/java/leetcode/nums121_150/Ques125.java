package leetcode.nums121_150;

public class Ques125 {

    public static void main(String[] args) {
        String ss = "0P";
        System.out.println(isPalindrome(ss));

    }

    public static boolean isPalindrome(String s) {

        if (s == null || s.length() == 0) return true;

        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c) || Character.isDigit(c)){
                sb.append(Character.toLowerCase(c));

            }
        }

        String str = sb.toString();
        return str.equals(sb.reverse().toString());

    }

}
