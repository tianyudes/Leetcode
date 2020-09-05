package Leetcode_Math;

public class Solution367 {

}
class Solution367Method1{//用二分法，然后注意mid要用double类型，要不然小的书算不出来，还有就是low + 1 < high 要不然也是算不出来
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
