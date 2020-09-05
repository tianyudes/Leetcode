package Leetcode_HashTable;

import java.util.HashMap;
import java.util.Map;

public class Solution205 {

	
}
class Solution205Method1{
	public boolean isIsomorphic(String s, String t) {
        //同一个位置上的字符必须是同样的abc = dcf aabbd= bbccf
        if(s.length() == 0 && t.length() == 0) return true;
        
        for(int i = 0; i < s.length(); i++ ){
            if(s.indexOf(s.charAt(i)) != t.indexOf(t.charAt(i))){
                return false;
            }
        }
        return true;
    }
	//就是刚才有一个误区就是，abb 和cdd 即使是到了第二个返回的是第一个b的位置，
	//也没有关系，d返回的也是第一个，但是adb和add就不一样了。
	//这个纯粹用的是string的方法做的，找一下有没有Hash Table的
}
class Solution205Method2{
	public boolean isIsomorphic(String s, String t) {
        if(s.length() == 0 && t.length() == 0) return true;
        boolean res = true; 
        Map<Character, Character> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++ ){
            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i)) == t.charAt(i)){
                    continue;
                }else{
                    return false;
                }
            }else{
                if(map.containsValue(t.charAt(i))){
                    return false;
                }
                map.put(s.charAt(i), t.charAt(i));
            }
        }
        return res;
    }
}
