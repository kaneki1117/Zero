package leetcode.nums61_90;

public class Ques71 {

//  最后的/会被省略
//  .. 是往上一层；. 是本层
//  // 替换成/
//

    public String simplifyPath(String path) {

        String res = "";

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

                }
            }
        }



    }
}
