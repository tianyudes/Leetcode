package Leetcode_HashTable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution290 {

	public static void main(String[] args) {
		String str = "dog cat cat dog";
		String pattern = "abba";
		System.out.println(wordPattern(pattern, str));
		}
	public static boolean wordPattern(String pattern, String str) {
		boolean res = true; 
		HashMap<Character, String> map = new HashMap();
		int i = 0;
		while(str.indexOf(" ") != -1 && i < pattern.length() - 1) {
			String word = str.substring(0,str.indexOf(" "));
			if(map.containsKey(pattern.charAt(i))) {
				res = map.get(pattern.charAt(i)).equals(word);
				str = str.substring(str.indexOf(" ")+1);
			}else{
				if(map.containsValue(word)) {
					 System.out.println(word);
					 return false;
				}
				map.put(pattern.charAt(i),word);
				str = str.substring(str.indexOf(" ")+1);
			}
			i++;
		
		}
		if(map.containsKey(pattern.charAt(i))) {
			return res && map.get(pattern.charAt(i)).equals(str);
		}else {
			return res && !map.containsValue(str);
		}
		
		//上面的忽略了如果最后一个是新的呢，那应该怎么弄....
		//还有一种情况 aabb 对应全都是一样的怎么办....
	}
		
}
class Solution290Method2{
	public boolean wordPattern(String pattern, String str) {
        if(pattern.length() == 0 || str.length() == 0 ) return false;
        boolean res = true; 
		HashMap<Character, String> map = new HashMap();
		int i = 0;
		while(str.indexOf(" ") != -1 && i < pattern.length() - 1) {
			String word = str.substring(0,str.indexOf(" "));
			if(map.containsKey(pattern.charAt(i))) {
				res = map.get(pattern.charAt(i)).equals(word);
				str = str.substring(str.indexOf(" ")+1);
                if(res == false) return false;
			}else{
				if(map.containsValue(word)) return false;
				map.put(pattern.charAt(i),word);
				str = str.substring(str.indexOf(" ")+1);
			}
			i++;
		
		}
        if(i != pattern.length() - 1) return false;
		if(map.containsKey(pattern.charAt(i))) {
			return res && map.get(pattern.charAt(i)).equals(str);
		}else {
			return res && !map.containsValue(str);
		}
    }
}
class Solution290Method3{
	public boolean wordPattern(String pattern, String str) {
        Map<Character, String> patMap = 
            new HashMap<Character,String>();
        Set<String> strSet = new HashSet<String>();
        String[] bagOfWords = str.split("\\s+");
        int patSize = pattern.length();
        int strSize = bagOfWords.length;
        
        if(patSize != strSize) {
            return false;
        }
        
        for(int i = 0; i < patSize; i++) {
            Character currChar = pattern.charAt(i);
            String currStr = bagOfWords[i];
            
            if(patMap.containsKey(currChar)) {
                String retrieved = patMap.get(currChar);
                if(!retrieved.equals(currStr)) {
                    return false;
                }
            } else {
                patMap.put(currChar, currStr);
            }
        }
        
        for(String currStr : patMap.values()) {
            if(!strSet.add(currStr)) {
                return false;
            }
        }
        return true;
    }
}
