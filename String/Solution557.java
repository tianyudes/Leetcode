package leetcode_String;

import java.util.HashMap;

public class Solution557 {

	public static void main(String[] args) {
		String s = "aas";
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		HashMap<Integer, Integer> map = new HashMap<>();
		
	}
	public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String ss : words){
            StringBuilder stringbuilder = new StringBuilder();
            String str = stringbuilder.append(ss).reverse().toString();
            sb.append(str);
            sb.append(" ");
        }
        return sb.toString().trim();
        
    }
}
