package leetcode_Array;

import java.util.Arrays;
import java.util.Stack;

public class Solution300 {

	public static void main(String[] args) {
		int[] input = {
				4,10,4,3,8,9};
		Solution_300 solution = new Solution_300();
		int res = solution.lengthOfLIS(input);
		Solution__300 solution2 = new Solution__300();
		int res2 = solution2.lengthOfLIS(input);
		System.out.println(res2);
	}
}
class Solution_300{
	public int lengthOfLIS(int[] nums) {
		if (nums.length == 0 || nums.length == 1) return nums.length;
		int res =1;
		int[] dp = new int[nums.length];
		Arrays.fill(dp, 1);
		for(int i = 1; i < nums.length; i++) {
			for(int j = 0; j < i; j++) {
				if(nums[i] > nums[j]) {
					dp[i] = dp[i] > dp[j] + 1 ? dp[i] : dp[j] + 1;
					res = res > dp[i] ? res : dp[i];
				}
			}
		}
		return res;
	}
}

class Solution__300{
	public int lengthOfLIS(int[] nums) {
		if (nums.length == 0 || nums.length == 1) return nums.length;
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(nums[0]);
		for (int i = 1; i < nums.length; i++) {
			if(nums[i] > stack.peek()) {
				stack.add(nums[i]);
			}else {
				for(int j = 0; j < stack.size(); j++) {
					if(nums[i] <= stack.get(j)) {
						stack.set(j, nums[i]);
						break;
					}
				}
			}
		}
		return stack.size();
	}
}