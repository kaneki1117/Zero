package leetcode.num1_30;

public class Ques10 {

    public static void main(String[] args) {
        String s = ".*";
        String ss = "ab";
    }


    public boolean isMatch(String s, String p) {

        if(s == null || p == null) return false;

        char[] str = s.toCharArray();
        char[] pat = p.toCharArray();
        return helper(str, 0, pat, 0);

    }

    public boolean helper(char[] str , int strIndex , char[] pat, int patIndex){
        if(strIndex == str.length && patIndex == pat.length){
            return true;
        }

        if(strIndex != str.length && patIndex == pat.length){
            return false;
        }

        //pat第二个为*时
        if(patIndex + 1 < pat.length && pat[patIndex + 1] == '*'){
            if((strIndex < str.length && str[strIndex] == pat[patIndex]) || (strIndex < str.length && '.' == pat[patIndex])){
                return  helper(str, strIndex + 1, pat , patIndex + 2) ||
                        helper(str, strIndex + 1 , pat, patIndex) ||
                        helper(str, strIndex , pat, patIndex + 2 );
            }else {
                return helper(str, strIndex, pat, patIndex + 2);
            }

        }

        //pat第二个不为*时
        if((strIndex < str.length && str[strIndex] == pat[patIndex]) || (strIndex < str.length && '.' == pat[patIndex])){
            return helper(str , strIndex + 1, pat , patIndex + 1);
        }

        return false;
    }

}
