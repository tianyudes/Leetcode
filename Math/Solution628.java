package Leetcode_Math;

import java.util.Arrays;

public class Solution628 {

}
class Solution628Method1{
	public int maximumProduct(int[] nums) {
        int length = nums.length;
        Arrays.sort(nums);
        return Math.max(nums[0] * nums[1] * nums[length - 1], nums[length - 1] * nums[length - 2] * nums[length - 3]);
    }
}
class Solution628Method2{
	public int maximumProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for(Integer i : nums){
            if(i >= max1){
                max3 = max2;
                max2 = max1;
                max1 = i;
            }else if(i >= max2){
                max3 = max2;
                max2 = i;
            }else if(i >= max3){
                max3 = i;
            }
            if(i <= min1){
                min2 = min1;
                min1 = i;
            }else if(i <= min2){
                min2 = i;
            }
        }
        return Math.max(min1 * min2 * max1, max3 * max2 * max1);
	}
}
