package leetcode.num1_30;
//拓展 **源码 Integer.toString** !!!


public class Ques8 {

/*
1. 若字符串开头是空格，则跳过所有空格，到第一个非空格字符，如果没有，则返回0.
2. 若第一个非空格字符是符号 +/-，则标记 sign 的真假
3. 若下一个字符不是数字，则返回0，完全不考虑小数点和自然数的情况，不过这样也好，起码省事了不少。
4. 如果下一个字符是数字，则转为整形存下来，若接下来再有非数字出现，则返回目前的结果。
5. 还需要考虑边界问题，如果超过了整型数的范围，则用边界值替代当前值。
*/
    public static void main(String[] args) {
        System.out.println(myAtoi("-123"));
        System.out.println(myAtoi("123"));
        System.out.println(myAtoi("4193 with"));
        System.out.println(myAtoi("2147483648"));

    }

    public static int myAtoi(String str) {
        if(str == null || str.length() == 0 || str.trim().length() ==0) return 0;

        char[] arr = str.trim().toCharArray();
        int sign = 1;
        long res = 0;

        for (int i = 0; i < arr.length; i++) {
            if(i == 0){
                if(arr[0] == '-'){
                    sign = -1;
                    continue;
                }
                if(arr[0] == '+'){
                    sign = 1;
                    continue;
                }

            }
            if(!Character.isDigit(arr[i])) return (int)res * sign;
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && str.charAt(i) - '0' > 7)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            res = res * 10 + Integer.parseInt(arr[i]+"");
        }

        return (int)res * sign;

    }
}
