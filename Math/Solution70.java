package Leetcode_Math;

public class Solution70 {

}
class Solution70Method1{
	public int climbStairs(int n) {
        if(n < 0) return -1;
        if(n <= 3) return n;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
	//�õݹ���ĺ�����������ը��
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
//�������ı�������˼ oneStep����n-1Ҫ�߶��ٲ�
