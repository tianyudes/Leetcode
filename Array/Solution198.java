package leetcode_Array;

public class Solution198 {

	public static void main(String[] args) {
		int[] nums = {5,2,6,3,9,7,1,10};
		Solution_198 solution = new Solution_198();
		int res = solution.rob(nums);
		System.out.println(res);
	}
}

class Solution_198{
    public int rob(int[] nums) {
        int nums_len = nums.length;
        if (nums_len == 0) return 0;
        if (nums_len == 1) return nums[0];
    	int[] treasure = new int[nums.length];
        treasure[0] = nums[0];
        treasure[1] = nums[0] > nums[1] ? nums[0] : nums[1];
        for(int i = 2; i < nums_len; i++) {
        	treasure[i] = treasure[i-1] > treasure[i-2] + nums[i] ? treasure[i-1] : treasure[i-2] + nums[i]; 
        }
        return treasure[nums_len - 1];
    }
}
