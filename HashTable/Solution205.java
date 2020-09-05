package Leetcode_HashTable;

import java.util.HashMap;
import java.util.Map;

public class Solution205 {

	
}
class Solution205Method1{
	public boolean isIsomorphic(String s, String t) {
        //ͬһ��λ���ϵ��ַ�������ͬ����abc = dcf aabbd= bbccf
        if(s.length() == 0 && t.length() == 0) return true;
        
        for(int i = 0; i < s.length(); i++ ){
            if(s.indexOf(s.charAt(i)) != t.indexOf(t.charAt(i))){
                return false;
            }
        }
        return true;
    }
	//���Ǹղ���һ���������ǣ�abb ��cdd ��ʹ�ǵ��˵ڶ������ص��ǵ�һ��b��λ�ã�
	//Ҳû�й�ϵ��d���ص�Ҳ�ǵ�һ��������adb��add�Ͳ�һ���ˡ�
	//��������õ���string�ķ������ģ���һ����û��Hash Table��
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
