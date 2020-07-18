package leetcode.nums61_90;

/**
 * 难！确实值得hard
 * - 空格： 我们需要排除的情况是，当前位置是空格而后面一位不为空格，但是之前有数字，小数点，自然底数或者符号出现时返回false。
 *
 * - 符号：符号前面如果有字符的话必须是空格或者是自然底数，标记sign为true。
 *
 * - 数字：标记num和numAfterE为true。
 *
 * - 小数点：如果之前出现过小数点或者自然底数，返回false，否则标记dot为true。
 *
 * - 自然底数：如果之前出现过自然底数或者之前从未出现过数字，返回false，否则标记exp为true，numAfterE为false。
 *
 * - 其他字符：返回false。
 *
 * 最后返回num && numAfterE即可
 */
public class Ques65 {

    public static void main(String[] args) {
        String s = " 005047e+6";
        System.out.println(isNumber(s));
    }


    public static boolean isNumber(String s) {
        if(s == null || s.isEmpty()) return false;

        boolean nums = false;
        boolean numsAfterE = true;
        boolean exp = false;
        boolean sign = false;
        boolean dot = false;

        int index = 0;


        while (index < s.length() &&  s.charAt(index) == ' ') {
            index++;
        }

        for (int i= index; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == ' ') {
                if(( i < s.length() -1 && s.charAt(i+1) != ' ') && (exp || nums || sign || dot)) return false;
            } else if (c == '+' || c == '-') {
                if( i > 0 && s.charAt(i - 1) != ' ' && s.charAt(i-1) != 'e') return false;
                sign = true;
            } else if (c == '.') {
                if( dot || exp) return false;
                dot = true;
            } else if (c == 'e') {
                if( exp || !nums ) return false;
                numsAfterE = false;
                exp = true;
            } else if (c >= '0' && c <= '9') {
                nums = true;
                numsAfterE = true;
            } else {
                return false;
            }

        }

        return nums && numsAfterE;



    }



    public boolean isNumberV2(String s) {

        String pattern = "[-+]?(\\d+\\.?|\\.\\d+)\\d*(e[-+]?\\d+)?";

        return pattern.matches(s);

    }



}
