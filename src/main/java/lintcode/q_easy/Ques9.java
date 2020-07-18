package lintcode.q_easy;

import java.util.ArrayList;
import java.util.List;

public class Ques9 {

    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        if (n <= 0) {
            return res;
        }

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                res.add("fizz");
            } else if (i % 3 != 0 && i % 5 == 0) {
                res.add("buzz");
            } else if (i % 3 == 0 && i % 5 == 0) {
                res.add("fizz buzz");
            } else {
                res.add(String.valueOf(i));
            }
        }

        return res;

        // write your code here
    }


}
