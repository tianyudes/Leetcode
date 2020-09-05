package Leetcode_Math;

public class Solution367 {

}
class Solution367Method1{//�ö��ַ���Ȼ��ע��midҪ��double���ͣ�Ҫ��ȻС�����㲻���������о���low + 1 < high Ҫ��ȻҲ���㲻����
	public boolean isPerfectSquare(int num) {
        if(num == 1 || num == 0) return true; 
        int low = 0;
        int high = num;
        while(low + 1 < high){
            double mid = (high - low) / 2 + low;
            if(mid * mid == num) {
            	return true;
            }else if(mid * mid < num) {
            	low = (int)mid;
            }else {
            	high = (int)mid;
            }
        }
        return false;
    }
}
