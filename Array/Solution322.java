package leetcode_Array;

public class Solution322 {

	public static void main(String[] args) {
		int[] coins = {2,5,7};
		int amount = 27;
		Solution_322 solution = new Solution_322();
		int res = solution.coinChange(coins, amount);
		System.out.println(res);
	}
}
class Solution_322{
	public int coinChange(int[] coins, int amount) {
		int[] coin_nums = new int[amount + 1];
		coin_nums[0] = 0;
		for(int i = 1; i <= amount; i++) {
			coin_nums[i] = Integer.MAX_VALUE;
			for(int j = 0; j < coins.length; j++) {
				if(i >= coins[j] && coin_nums[i - coins[j]] != Integer.MAX_VALUE) {
					coin_nums[i] = Math.min(coin_nums[i], coin_nums[i - coins[j]] + 1);
				}
			}
		}
		return coin_nums[coin_nums.length - 1];
	}
}
