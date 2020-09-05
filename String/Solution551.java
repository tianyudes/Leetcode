package leetcode_String;

public class Solution551 {

	public boolean checkRecord(String s) {
        int[] record = new int[2];
        if(s.length() == 1) return true;
        if(s.charAt(0) == 'A') record[0]++;
        if(s.charAt(s.length() - 1) == 'A') record[0]++;
        for(int i = 1; i < s.length() - 1; i++){
            if(s.charAt(i) == 'A'){
                record[0]++;
                continue;
            }
            if(s.charAt(i) == 'L' && s.charAt(i-1) == 'L' && s.charAt(i+1) == 'L'){
                return false;
            }
        }
        return record[0] < 2 ;
    }
	public boolean checkRecord2(String s) {
		return !(s.indexOf("LLL") >= 0 || s.indexOf("A") >= 0 && s.indexOf("A", s.indexOf("A") + 1) >= 0);
		//||之前是一个条件，满足就直接输出，即找到LLL输出true，然后再看后面得就是有A而且不止一个A就返回true
		//s.indexOf(String, int) 就是从int开始查找String所在的位置。
	}
}
