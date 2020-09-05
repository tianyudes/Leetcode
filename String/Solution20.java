package leetcode_String;

import java.util.Stack;

public class Solution20 {

}
class Solution20Method1{
	public boolean isValid(String s) {
        if(s.length() % 2 != 0) return false;
        Stack<Character> stack = new Stack<>();
        for(Character ch : s.toCharArray()){
            if(ch == '('){
                stack.push(')');
            }else if(ch == '['){
                stack.push(']');
            }else if(ch == '{'){
                stack.push('}');
            }else{
                if(stack.isEmpty() || ch != stack.pop()){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
