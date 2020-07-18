package leetcode.num1_30;

public class Ques6 {

    public static void main(String[] args) {

        String s = "123456789";
        System.out.println(convert(s, 2));
        System.out.println(convert(s, 3));

    }

    public static String convert(String s, int numRows) {
        if(s == null || s.length() < 2 || numRows <= 1) return s;

        StringBuilder[] strs = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            strs[i] = new StringBuilder();
        }

        int len = s.length();
        int index = 0;

        while (index < len){
            for (int i = 0; i < numRows && index < len; i++) {
                strs[i].append(s.charAt(index));
                index++;
            }

            for(int i = numRows - 2; i>0 && index < len ; i --){
                strs[i].append(s.charAt(index));
                index++;
            }
        }

        String res = "";
        for (int i = 0; i < strs.length; i++) {
            res += strs[i].toString();
        }
        return res;
    }
}
