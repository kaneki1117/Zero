package lintcode.q_easy;

public class Ques2 {

    public long trailingZeros(long n) {
        // write your code here, try to do it without arithmetic operators.
        if(n <= 0) return 0;
        long res = 0;
        while (n != 0){
            res += n/5;
            n = n/5;
        }
        return res;
    }
}
