package leetcode.num31_60;

public class Ques43 {

    public static void main(String[] args) {
        String num1 = "100";
        String num2 = "100";

        System.out.println(multiply(num1, num2));
    }

    public static String multiply(String num1, String num2) {
        if(num1 == null || num2 == null ) return "";

        int m = num1.length();
        int n = num2.length();

        int[] pos = new int[m+n];

        for (int i = m -1; i >= 0 ; i--) {
            for(int j = n - 1 ; j >= 0 ; j--) {
                int sum = (num1.charAt(i) - '0') * (num2.charAt(j) - '0') + pos[i + j + 1];
                pos[i + j ] += sum / 10;
                pos[i + j + 1] = sum % 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i : pos) {
            if(sb.length() == 0 && i == 0) continue;
            sb.append(i);
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }

}
