package leetcode.num31_60;

public class Ques58 {

    public static void main(String[] args) {
        String str = "hello world";
        System.out.println(lengthOfLastWord(str));

    }

    public static int lengthOfLastWord(String s) {
        if(s == null || s.length() == 0 || s.trim().length() == 0) return 0;
        String[] strs = s.split("\\s+");
        return strs[strs.length - 1].length();

    }
}
