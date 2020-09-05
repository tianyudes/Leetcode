package leetcode_Array;

import java.util.ArrayList;
import java.util.List;

public class Solution120 {
	public static void main(String[] args) {
		List<Integer> lis0 = new ArrayList();
		lis0.add(2);
		List<Integer> lis1 = new ArrayList();
		lis1.add(3);
		lis1.add(4);
		List<Integer> lis2 = new ArrayList();
		lis2.add(6);
		lis2.add(5);
		lis2.add(7);
		List<Integer> lis3 = new ArrayList();
		lis3.add(4);
		lis3.add(1);
		lis3.add(8);
		lis3.add(3);
		List<List<Integer>> tri = new ArrayList<List<Integer>>();
		tri.add(lis0);
		tri.add(lis1);
		tri.add(lis2);
		tri.add(lis3);
		System.out.println(tri.get(0).get(0));
		Solution_120 solution = new Solution_120();
		int res = solution.minimumTotal(tri);
		System.out.println(res);
	}
	
}
class Solution_120 {
    public int minimumTotal(List<List<Integer>> triangle) {
    	int res = Integer.MAX_VALUE;
    	int[][] dp = new int[triangle.size()+1][triangle.size()+1];
        for (int i = triangle.size() - 1; i >= 0; i--) {
        	List<Integer> lis = triangle.get(i);
        	for(int j = 0; j < lis.size(); j++) {
        		dp[i][j] = Math.min(dp[i+1][j], dp[i+1][j+1]) + lis.get(j);
        	}
        }
        return dp[0][0];
    }
    
}
