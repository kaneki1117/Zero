package lintcode.contest_200719;

public class Ques1 {

    public static void main(String[] args) {
        System.out.println(numWaterBottles(9,3));
        System.out.println(numWaterBottles(15,4));
        System.out.println(numWaterBottles(5,5));
        System.out.println(numWaterBottles(2,3));

    }

    public static int numWaterBottles(int numBottles, int numExchange) {

        if(numExchange == 0 || numBottles == 0) return 0;

        int res = numBottles;
        while (numBottles / numExchange != 0) {
            res += numBottles / numExchange;
            numBottles = numBottles / numExchange + numBottles % numExchange;
        }

        return res;

    }
}
