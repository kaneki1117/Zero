package lintcode.q_easy;

import q_util.PrintUtil;

public class Ques8 {

    public static void main(String[] args) {

        char[] str = {'a','b','c','d','e','f'};
        int offset = 11;
        rotateString(str, offset);
        PrintUtil.printArray(str);

    }

    public static void rotateString(char[] str, int offset) {
        if(str.length == 0) return;

        int off = offset % str.length;
        int right = str.length - 1;
        swap(str,0, right - off);
        swap(str, right - off + 1 ,right);
        swap(str, 0 ,right);
    }

    public static void swap(char[] str, int i , int j){
        while(i < j){
            char temp = str[i];
            str[i++] = str[j];
            str[j--] = temp;
        }

    }
}
