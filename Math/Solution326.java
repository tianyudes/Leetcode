package Leetcode_Math;
/*
 * 类似的还有231，求是否为2的次方数，是否为4的次方数。
 */
public class Solution326 {

}
class Solution326Method1{
	public boolean isPowerOfThree(int n) {
        if( n < 1) return false;
        while( n % 3 == 0){
            n = n / 3;
        }
        return n == 1;
    }
	//最简单的
}
class Solution326Method2{
	public boolean isPowerOfThree(int n) {
        return n > 0 && 1162261467 % n == 0;
    }
	//这个是利用了再int的范围内，最大的只有3^19所以就这么算的，要记住这个19
}
class Solution326Method3{
	public boolean isPowerOfThree(int n) {
        return (Math.log10(n) / Math.log10(3)) % 1 == 0;
    }
}
