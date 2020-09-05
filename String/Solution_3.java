package leetcode_String;

import java.util.Arrays;

public class Solution_3 {
	public static void main(String[] args) {
		Solution s = new Solution();
	String str = "pwwekew";
	System.out.println(s.lengthOfLongestSubstring(str));
	}
	
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
    int[] last_pos = new int[128];
    Arrays.fill(last_pos, -1);
    char[] s_to_char = s.toCharArray();
    int begin = 0;
    int current_length = 0;
    int res = 0;
    for (int i = 0; i < s.length(); i++) {
    	
    	if (last_pos[(int)s_to_char[i]] == -1) {
    		current_length++;
    	}
    	else {
    		begin = begin > last_pos[(int)s_to_char[i]] + 1 ? begin : last_pos[(int)s_to_char[i]] + 1;
    		res = res > current_length? res: current_length;
    		current_length = i - begin + 1;
    		
    	}
    	last_pos[(int)s_to_char[i]] = i;
    	System.out.println((int)s_to_char[i]);
    	res = res > current_length? res: current_length;
    	}
    return res > current_length? res: current_length;
    }
    }


    