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
		//||֮ǰ��һ�������������ֱ����������ҵ�LLL���true��Ȼ���ٿ�����þ�����A���Ҳ�ֹһ��A�ͷ���true
		//s.indexOf(String, int) ���Ǵ�int��ʼ����String���ڵ�λ�á�
	}
}
