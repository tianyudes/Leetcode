package leetcode_String;

public class Solution434 {

	public static void main(String[] args) {
		String str = "Hello   ketty";
		System.out.println(countSegments(str));
	}
	public static int countSegments(String s) {
		String str = s.trim();
        if(str == null || str.length() == 0) return 0;
        int num = 1;
        while(str.lastIndexOf(' ') != -1){
            str = str.substring(0,str.lastIndexOf(' '));
            num++;
            str = str.trim();
        }
        return num;
	}
}
