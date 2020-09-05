package leetcode_Array;

public class Solution643 {

}
class Solution643Method1{
	public double findMaxAverage(int[] nums, int k) {
        double sum = 0.0;
        double max = -100000.0;
        if(nums.length == 1 && k == 1) return nums[0];
        for(int i = 0; i < k; i++){
            sum += nums[i];
            max = sum;
        }
        //这个就是一定要注意要分别保留这个max和sum。
        for(int i = 0; i < nums.length - k; i++){
            max = Math.max( max, (sum - nums[i] + nums[i + k]));
            sum = sum - nums[i] + nums[i + k];
        }
        return (double)max / k;
    }
}
