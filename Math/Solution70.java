package Leetcode_Math;

public class Solution70 {

}
class Solution70Method1{
	public int climbStairs(int n) {
        if(n < 0) return -1;
        if(n <= 3) return n;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
	//用递归真的很慢，慢到爆炸。
}
class Solution70Method2{
	public int climbStairs(int n) {
        if(n == 1) return 1;
        int oneStep = 1;
        int twoStep = 2;
        int res = 0;
        while(n >= 3){
            res = oneStep + twoStep;
            oneStep = twoStep;
            twoStep = res;
            n--;
        }
        return twoStep;
    }
}
//这个里面的变量的意思 oneStep就是n-1要走多少步
