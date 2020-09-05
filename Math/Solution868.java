package Leetcode_Math;

public class Solution868 {

	public static void main(String[] args) {
		int i = 22;
		int max = gap(i);
		System.out.println(max);
		
	}
	public static int gap(int i) {
		if(Integer.bitCount(i) == 1) return 0;
		int old = 0;
		int max = Integer.MIN_VALUE;
		String str = Integer.toBinaryString(i);
		System.out.println(str);
		for(int j = 0; j < str.length(); j++) {
			if(str.charAt(j) == '1') {
				max = Math.max(max, j - old);
				old = j;
			}
		}
		return max;
	}
}
