package Leetcode_HashTable;

import java.util.HashMap;
import java.util.Map;

public class Solution242 {

}
class Solution242Method1{
	public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        if(s.length() == 0 & t.length() == 0 ) return true;
        Map<Character, Integer> mapS = new HashMap<>();
        //Map<Character, Integer> mapT = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(mapS.containsKey(s.charAt(i))){
                mapS.put(s.charAt(i), mapS.get(s.charAt(i)) + 1);
            }else{
                mapS.put(s.charAt(i), 1);
            }
            if(mapS.containsKey(t.charAt(i))){
                mapS.put(t.charAt(i),mapS.get(t.charAt(i)) - 1);
            }else{
                mapS.put(t.charAt(i),-1);
            }
        }
        for(Integer value : mapS.values()){
            if(value != 0){
                return false;
            }
        }
        return true;
    }
	//�뷨�Ƚϼ򵥣���Ҫ�ǿ��Ը�ϰ����map����غ�������α���values�������ȡ��ֵ������Ҫ����������String�ǲ��ܱ��
}

class Solution224Method2{
	public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())return false;
        int[] letter = new int[26];
        for(int i = 0; i < s.length(); i++){
            letter[(int)(s.charAt(i) - 'a')]++;
            letter[(int)(t.charAt(i) - 'a')]--;
        }
        for(int i = 0; i < 26; i++){
            if(letter[i] != 0){
                return false;
            }
        }
        return true;
    }
}
