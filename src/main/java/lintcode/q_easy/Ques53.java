package lintcode.q_easy;

public class Ques53 {

    public static void main(String[] args) {

    }

    public String reverseWords(String s) {
        String res = "";
        String[] words = s.trim().split("\\s+");
        for (int i = words.length - 1; i > 0; --i) {
            res += words[i] + " ";
        }
        return res + words[0];
    }
}
