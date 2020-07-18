package leetcode.num1_30;

public class Ques7 {

    public static void main(String[] args) {
        System.out.println(reverse(120));

    }
    public static int reverse(int x) {

        int res = 0;
        while (x != 0){
            if (Math.abs(res) > Integer.MAX_VALUE / 10) return 0;
            res = res * 10 + x % 10;
            x /= 10;
        }

        return res;

    }

}
