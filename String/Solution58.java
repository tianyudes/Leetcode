package leetcode_String;

public class Solution58 {

	public int lengthOfLastWord(String s) {
        if(s.trim().length() == 0) return 0;
        return s.trim().length() - s.trim().lastIndexOf(" ")-1;
    }
	//������һ��Ҫ�������Ǹ�lastIndexOf(),Ȼ������Ҫ��˫���š�
}
