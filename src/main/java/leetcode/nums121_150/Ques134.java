package leetcode.nums121_150;

public class Ques134 {

    public static void main(String[] args) {

        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};

        System.out.println(canCompleteCircuit(gas, cost));


    }


    public static int canCompleteCircuit(int[] gas, int[] cost) {
        if(gas == null || cost == null || gas.length != cost.length) return -1;

        int sum = 0 ; int total = 0; int start = 0;

        for (int i = 0; i < gas.length; i++) {
            total += gas[i] - cost[i];
            sum += gas[i] - cost[i];

            if(sum < 0) {
                sum = 0;
                start = i+1;
            }
        }

        return total < 0 ? -1 :start;
    }


}
