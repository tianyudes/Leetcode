package Leetcode_HashTable;

import java.util.Arrays;
import java.util.HashMap;

public class Solution389 {
	public static void main(String[] args) {
		int[] letter = {0,0,0,1,0};
		String str = Arrays.toString(letter);
		System.out.println((char)(5 + 'a'));
	}

	public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(Character ch : t.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            }else{
                map.put(ch, 1);
            }
        }
        for(Character ch : s.toCharArray()){
           map.put(ch, map.get(ch) - 1);
        }
        for(Character ch : t.toCharArray()){
           if(map.get(ch) == 1)
               return ch;
        }
        return ' ';
    }
	public char findTheDifference2(String s, String t) { //�������ڤ�����һ�㡣
        int letter = 0;
        for(Character ch : t.toCharArray()){
            letter += ch;
        }
        for(Character ch : s.toCharArray()){
            letter -= ch;
        }
        return (char)letter;
    }
}
