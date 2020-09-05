package leetcode_String;

import java.util.Stack;

public class Solution345 {

}
class Solution345Method1{
	public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(Character ch : s.toCharArray()){
            if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch =='O' || ch == 'U'){
                stack.push(ch);
            }
        }
        for(Character ch : s.toCharArray()){
             if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch =='O' || ch == 'U' ){
                sb.append(stack.pop());
            }else{
                 sb.append(ch);
            }
        }
        return sb.toString();
    }//这个应该把if里面的放到函数里面去，这样会比较好
}
class Solution345Method2{ //这个在数组内直接修改。双指针的方法。
	public String reverseVowels(String s) {
        int right = s.length() - 1;
        int left = 0;
        char[] res = new char[s.length()];
        while(left <= right){
            if(isVowel(s.charAt(left)) && isVowel(s.charAt(right))){
                res[left] = s.charAt(right);
                res[right] = s.charAt(left);
                right--;
                left++;
            }else if(isVowel(s.charAt(left))){
                res[right] = s.charAt(right);
                right--;
            }else{
                res[left] = s.charAt(left);
                left++;
            }
        }
        return new String(res);
    }
    public boolean isVowel(char ch){
        if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' 
         || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' 
         || ch =='O' || ch == 'U' ){
            return true;
        }
        return false;    
    }
}
