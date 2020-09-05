package Leetcode_Math;

public class Solution441 {

}
class Solution441Method1{
	public int arrangeCoins(int n) {
        int res = 0;
        if(n <= 0) return res;
        for(int i = 1; n >= i; n = n-i, i++){
            res++;
        }
        return res;
    }
}