package leetcode.nums61_90;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Ques71 {

//  最后的/会被省略
//  .. 是往上一层；. 是本层
//  // 替换成/
//

    public static void main(String[] args) {
        String path1 = "/a//b//c/.//a";
        System.out.println(simplifyPath(path1));

    }


    public static String simplifyPath(String path) {

        String[] strs = path.split("/");
        Stack<String> stack = new Stack<>();

        Set<String> params = new HashSet(Arrays.asList("",".",".."));

        for(String s : strs) {
            if(s.equals("..") && !stack.isEmpty()) stack.pop();
            else  if(!params.contains(s)) stack.push(s);
        }

        String res = "";
        for(String s : stack) res = res + "/" + s;

        return res.length() == 0 ? "/" : res;

    }


    //错误太多 情况； 应该直接按split 去判断
    /*public static String simplifyPath(String path) {

        String res = "";
        if(path == null || path.length() == 0) return res;

        char[] arr = path.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '/') {
                if(i - 1 >= 0 && arr[i-1] == '/') {
                    continue;
                } else {
                    res += arr[i];
                }
            } else if (arr[i] == '.') {
                if(i+1 < arr.length && arr[i+1] == '.') {
                    //if(i-1>= 0 && arr[i-1] == '/') res = res.substring(0, res.length() - 1);
                    int i1 = res.lastIndexOf('/');
                    if(i1 >= 0 ) {
                        res = res.substring(0, i1);
                    }
                }
                i++;
            } else {
                res += arr[i];
            }
        }


        if(res.length() > 1 && res.charAt(res.length() - 1) == '/') return res.substring(0, res.length() - 1);

        return res;

    }*/
}
