package leetcode.num1_30;


//没手敲  记得重写
public class Ques29 {
    public static void main(String[] args) {
        System.out.println(divide(14,2));
    }

    public static int divide(int dividend, int divisor) {
        if(divisor == 0 || (dividend == Integer.MIN_VALUE && divisor == -1)) return Integer.MAX_VALUE;
        if(dividend == 0) return 0;

        long Idividend = Math.abs((long) dividend);
        long Idivisor = Math.abs((long) divisor);

        boolean negative = false;
        if((dividend < 0 && divisor > 0 )|| (dividend > 0 && divisor < 0)){
            negative = true;
        }

        int res = 0;
        while (Idividend >= Idivisor){
            long multiple = 1;
            long tempIdivisor = Idivisor;
            while (Idividend >= tempIdivisor << 1){
                multiple <<= 1;
                tempIdivisor <<= 1;
            }
            res += multiple;
            Idividend -= tempIdivisor;
        }

        if(negative) return res * (-1);
        return res;


    }





}
