package leetcode_Array;

public class Solution53 {

	public static void main(String[] args) {
		int[] nums = {1,2};
		Solution_53 solution = new Solution_53();
		int res = solution.maxSubArray(nums);
		System.out.println(res);
	}
}
class Solution_53{
	public int maxSubArray(int[] nums) {
        int[] res = new int[nums.length];
        int max = nums[0];
        res[0] = nums[0];
        for(int i = 1; i < nums.length; i++) {
        	if (res[i - 1] > 0) {
        		res[i] = nums[i] + res[i-1];
        	}else {
        		res[i] =nums[i];
        	}
        	max = max > res[i] ? max : res[i];
 
        }
        return max;
    }
}