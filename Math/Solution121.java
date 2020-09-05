package Leetcode_Math;

public class Solution121 {

	public int maxProfit(int[] prices) {
        if(prices.length < 2) return 0;
        int max = Integer.MIN_VALUE;
        int min = prices[0];
        for(int i = 1; i < prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            max = Math.max(max, prices[i] - min);
        }
       return max > 0 ? max : 0; 
    }
}
