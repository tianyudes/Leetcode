package Leetcode_Math;

public class Solution633 {

}
class Solution633Method1{
	public boolean judgeSquareSum(int c) {
        if( c < 0) return false;
        //boolean res = false;
        for(int i = (int)Math.sqrt(c); i >= 0; i--){
            int left = c - i * i;
            if(Math.sqrt(left) - (int)Math.sqrt(left) <= 0.000000001){
                return true;
            }
        }
        return false;
    }
}
