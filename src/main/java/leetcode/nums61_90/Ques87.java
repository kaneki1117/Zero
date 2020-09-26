package leetcode.nums61_90;


//1.防止无限递归 < length 而不是 <=
//2.比较的两种为true的形式


public class Ques87 {



    public static void main(String[] args) {

        String str1 = "abcde";
        String str2 = "caebd";
        System.out.println(isScramble(str1, str2));


    }

    public static boolean isScramble(String s1, String s2) {

        if (s1 == null || s2 == null || s1.length() != s2.length()) return false;

        if (s1.equals(s2)) return true;

        int[] letters = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            letters[s1.charAt(i) - 'a']++;
            letters[s2.charAt(i) - 'a']--;
        }

        for (int i = 0; i < letters.length; i++) {
            if(letters[i] != 0) return false;
        }


        for (int i = 1; i < s1.length(); i++) {
            String str1 = s1.substring(0, i);
            String str2 = s2.substring(0, i);
            String str3 = s1.substring(i);
            String str4 = s2.substring(i);
            String str5 = s2.substring(s2.length()-i);
            String str6 = s2.substring(0 , s2.length()-i);
            if(isScramble(str1 , str2) && isScramble(str3 , str4)) return true;
            if(isScramble(str1 , str5) && isScramble(str3 , str6)) return true;

        }

        return false;



    }
}
