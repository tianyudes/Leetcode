package leetcode_String;

public class Solution459 {

	public static void main(String[] args) {
		String str = "abcabcabcabc";
		System.out.println(repeatedSubstringPatternWrong(str));
	}
	public static boolean repeatedSubstringPatternWrong(String s) { //这么找是找不到的。
        if(s.length() == 1) return false;
        StringBuilder unit = new StringBuilder();
        String left = "";
        unit.append(s.charAt(0));
        while(s.lastIndexOf(unit.toString()) != 0){
        	
            unit.append(s.charAt(unit.length()));
        }
        System.out.println(unit.toString());
        while(s.indexOf(unit.toString()) == 0) {
        	s = s.substring(unit.length(),s.length());
        }
        return true;
	}
		public boolean repeatedSubstringPattern(String s) {
	        String res = s + s;
	        res = res.substring(1, res.length() - 1);
	        return res.indexOf(s) != -1;
	    }
}
