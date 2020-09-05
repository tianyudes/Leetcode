package leetcode_String;

import java.util.HashMap;

public class Solution443 {

	public static void main(String[] args) {
		char[] chars = {'b','b','b','a'};
		
		System.out.println(compress(chars));
	}
	public static int compress0(char[] chars) {
        if(chars == null || chars.length == 0) return 0;
        int res = 1;
        int count = 1;
        for(int i = 1; i < chars.length; i++){
            if(chars[i] != chars[i-1]){
                if(count == 1){
            
                }else if(count < 9){
                    chars[res++] = chars[i];
                    chars[res++] = (char)(count + '0');
                }else{
                    chars[res++] = chars[i];
                    while(count > 10){
                    chars[res++] = (char)(count % 10 + '0');
                    count = count / 10;
                    }
                    chars[res++] = (char)(count / 10 + '0');
                } 
            }else{
                count++;
            }
        }
        return res;
    }
	   public static int compress(char[] chars) {
	        StringBuilder sb = new StringBuilder();
	        HashMap<Character, Integer> map = new HashMap<>();
	        for(int i =0; i < chars.length; i++){
	            if(map.containsKey(chars[i])){
	                map.put(chars[i], map.get(chars[i]) + 1);
	            }else{
	                map.put(chars[i], 1);
	            }
	        }
	        for(Character ch : chars){
	            if(sb.toString().indexOf(ch) == -1){
	                sb.append(ch);
	                sb.append(map.get(ch));
	            }
	        }
	        System.out.println();
	        return sb.toString().length();
	    }
}
