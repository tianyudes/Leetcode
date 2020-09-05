package Leetcode_Math;

public class Solution53 {

	public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(sum < 0){
                sum = 0;
            }
            sum += nums[i];
            max = Math.max(max, sum); 
        }
        return max;
    }
}
