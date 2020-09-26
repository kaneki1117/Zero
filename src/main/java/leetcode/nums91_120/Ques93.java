package leetcode.nums91_120;

import com.google.common.base.Joiner;
import q_util.PrintUtil;

import java.util.ArrayList;
import java.util.List;

//没有考虑到 IP 三位数 头部不为0  直接就Parse了！！！
public class Ques93 {

    public static void main(String[] args) {
        String str = "010010";
        PrintUtil.printStringList(restoreIpAddresses(str));
    }

    public static List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        if ( s == null || s.length() == 0 || s.length() > 12) return result;

        List<List<String>> tempResult = new ArrayList<>();

        helper(0, s , new ArrayList<>(), tempResult);

        for(List<String> list : tempResult) {
            String tempS = "";
            for (String ss : list) {
                tempS += ss + ".";
            }
            tempS = tempS.substring(0,tempS.length()-1);
            result.add(tempS);
        }

        return result;

    }

    private static void helper(int index , String s, List<String> list, List<List<String>> tempResult) {
        if ( index == s.length() && list.size() == 4) {
            tempResult.add(new ArrayList<>(list));
            return;
        }


        for (int i = index; i <= s.length() && i <= index + 3; i++) {
            String temp = s.substring(index, i);
            if(!isValid(temp)) {
                continue;
            }
            list.add(temp);
            helper(i , s , list , tempResult);
            list.remove(list.size()-1);
        }

    }


    private static boolean isValid(String temp) {
        if(temp == null || temp.length() == 0) return false;

        if (temp.length() > 1 && temp.charAt(0) == '0') return false;

        Integer i = Integer.parseInt(temp);
        if ( i >= 0 && i <= 255) return true;

        return false;
    }
}
