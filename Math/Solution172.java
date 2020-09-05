package Leetcode_Math;

public class Solution172 {

	public int trailingZeroes(int n) {
        if(n < 5) return 0;
        else if(n < 25) return n / 5;
        else return n / 5 + trailingZeroes(n / 5); 
    }
}
