package leetcode_String;

public class Solution171 {

	public int titleToNumber(String s) {
        if(s == null || s.length() == 0) return 0;
        char[] ch = s.toCharArray();
        int res = 0;
        for(int i = 0; i < ch.length ; i++){
            res = (int)(ch[i] - 'A' + 1) + res * 26;
        }
        return res;
    }
}
