package lintcode.q_easy;

import q_util.NestedInteger;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Ques22 {
    // @param nestedList a list of NestedInteger
    // @return a list of integer
    public List<Integer> flatten(List<NestedInteger> nestedList) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        Stack<NestedInteger> stack = new Stack<>();
        if(nestedList == null ) return result;
        for(int i = nestedList.size() - 1 ; i >= 0 ; i--){
            stack.push(nestedList.get(i));
        }

        while (!stack.empty()){
            NestedInteger nested = stack.pop();
            if(nested.isInteger()){
                result.add(nested.getInteger());
            }else{
               List<NestedInteger> list = nested.getList();
               for(int i = list.size() - 1 ; i >= 0 ; i--){
                   stack.push(list.get(i));
               }
            }
        }

        return result;
    }
}
