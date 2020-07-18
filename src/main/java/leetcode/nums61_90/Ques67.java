package leetcode.nums61_90;

public class Ques67 {

    public static void main(String[] args) {

    }

    public String addBinary(String a, String b) {
        if(a == null && a.length() == 0) return b;
        if(b == null && b.length() == 0) return a;

        int idxA = a.length() - 1;
        int idxB = b.length() - 1;


        int carry = 0;
        String res = "";
        while (idxA >= 0 || idxB >= 0) {
            int pA = idxA >= 0 ? a.charAt(idxA--) - '0' : 0;
            int pB = idxB >= 0 ? b.charAt(idxB--) - '0' : 0;

            int sum = pA + pB + carry;
            res  =  sum % 2 + res;
            carry = sum / 2;
        }

        if (carry == 1) return 1 + res;

        return res;

    }



}
