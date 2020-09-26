package leetcode.nums61_90;


//总结： 位运算的题 很可能考虑 ^ 异或;
import q_util.PrintUtil;

import java.util.ArrayList;
import java.util.List;

public class Ques89 {


    public static List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        if(n < 0) {
            return result;
        }

        for (int i = 0; i < Math.pow(2, n); i++) {
            int num = (i >> 1) ^ i;
            result.add(num);
        }

        return result;

    }



    public static void main(String[] args) {
        PrintUtil.printIntList(grayCode(0));
    }
}
