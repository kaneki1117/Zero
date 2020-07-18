package leetcode.num1_30;


//x < 0 的时候的情况

//越界 不考虑也是对的
//if(res * 10 > Integer.MAX_VALUE || (res == Integer.MAX_VALUE / 10 && res % 10 - 7 > 0 )){
//        return false;
//        }
public class Ques9 {


    public static void main(String[] args) {
        System.out.println(isPalindrome(122));
        System.out.println(isPalindrome(121));

    }

    public static boolean isPalindrome(int x) {

        if(x < 0) return false;


        int res = 0;
        int temp = x;
        while (temp != 0){
            res = res * 10 + temp % 10;
            temp /= 10;
        }

        return res == x;

    }
}
