package leetcode_String;

public class Solution58 {

	public int lengthOfLastWord(String s) {
        if(s.trim().length() == 0) return 0;
        return s.trim().length() - s.trim().lastIndexOf(" ")-1;
    }
	//首先是一定要找最后的那个lastIndexOf(),然后里面要用双引号。
}
