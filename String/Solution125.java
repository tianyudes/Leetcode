package leetcode_String;

public class Solution125 {

	
}
class Solution125Method1{
	public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() -1;
        boolean res = true; 
        s = s.toLowerCase();
        while(i <= j){
            if(isWord(s,i) && isWord(s,j)){
                if(s.charAt(i) != s.charAt(j)){
                    return false;
                }else{
                    i++;
                    j--;
                }
            }else if(isWord(s,i)){
                j--;
            }else{
                i++;
            }
        }
        return true;
    }
    public boolean isWord(String s, int i){
        if(s.charAt(i) >= 'a' && s.charAt(i) <='z' || s.charAt(i) >= '0' && s.charAt(i) <= '9'){
            return true;
        }
        return false;
    }
    //这个是双指针的方法
}
class Solution125Method2{
	public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
       for(int i = 0; i < s.length(); i++){
            if(isWord(s,i)){
                sb.append(s.charAt(i));
            }
       }
       return sb.toString().indexOf(sb.reverse().toString()) == 0;    
    }
    public boolean isWord(String s, int i){
        if(s.charAt(i) >= 'a' && s.charAt(i) <='z' || s.charAt(i) >= '0' && s.charAt(i) <= '9'){
            return true;
        }
        return false;
    }
    //第二种方法用StringBuilder来回倒。
}
