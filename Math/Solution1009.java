package Leetcode_Math;

public class Solution1009 {

	public static void main(String[] args) {
		int N = 7;
		System.out.println(bitwiseComplement(N));
	}
	public static int bitwiseComplement(int N) {
        String str = Integer.toBinaryString(N);
        StringBuilder sb = new StringBuilder();
        for(Character ch : str.toCharArray() ) {
        	if(ch == '0') {
        		sb.append('1');
        	}else if(ch == '1') {
        		sb.append('0');
        	}
        }
		int res = Integer.parseInt(sb.toString(),2);
		return res;
		
    }
}
