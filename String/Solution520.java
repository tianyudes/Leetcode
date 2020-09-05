package leetcode_String;

public class Solution520 {

	public boolean detectCapitalUse(String word) {
        if(word.equals(word.toUpperCase())) return true;
        for(int i = 1; i < word.length(); i++){
            if(word.charAt(i) >= 'A' && word.charAt(i) <= 'Z' && i != 0){
                return false;
            }
        }
        return true;
    }
}
