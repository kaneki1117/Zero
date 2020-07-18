package leetcode.num31_60;

public class Ques38 {

    public static void main(String[] args) {
        System.out.println(countAndSay(1));
        System.out.println(countAndSay(2));
        System.out.println(countAndSay(5));
    }

    public static String countAndSay(int n) {

        if(n <= 0) return "";

        String s = "1";

        for (int i = 1; i < n ; i++) {
            int count = 0;
            StringBuffer sb = new StringBuffer();

            for (int j = 0; j < s.length(); j++) {
                if(j != 0 && s.charAt(j) != s.charAt(j-1)) {
                    sb.append(count+"");
                    sb.append(s.charAt(j-1));
                    count = 1;
                    continue;
                }
                count++;
            }
            sb.append(count+"");
            sb.append(s.charAt(s.length()-1));
            s = sb.toString();


        }
        return s;
    }
}
