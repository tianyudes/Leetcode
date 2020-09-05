package leetcode_Array;

public class Solution746 {

	public int minCostClimbingStairs(int[] cost) {
        if(cost.length == 1) return cost[0];
        if(cost.length == 2) return Math.min(cost[0],cost[1]);
        int[] step = new int[cost.length + 1];
        step[0] = 0;
        step[1] = 0;
        for(int i = 2; i <= cost.length; i++){
            step[i] = Math.min(cost[i - 2] + step[i -2], cost[i -1] + step[i -1]);
        }
        return step[cost.length];
        //动态规划问题：状态式就是向前计算每次走过来得两步或者一步怎么走最省力
    }
}
