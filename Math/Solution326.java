package Leetcode_Math;
/*
 * ���ƵĻ���231�����Ƿ�Ϊ2�Ĵη������Ƿ�Ϊ4�Ĵη�����
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
	//��򵥵�
}
class Solution326Method2{
	public boolean isPowerOfThree(int n) {
        return n > 0 && 1162261467 % n == 0;
    }
	//�������������int�ķ�Χ�ڣ�����ֻ��3^19���Ծ���ô��ģ�Ҫ��ס���19
}
class Solution326Method3{
	public boolean isPowerOfThree(int n) {
        return (Math.log10(n) / Math.log10(3)) % 1 == 0;
    }
}
