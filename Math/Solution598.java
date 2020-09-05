package Leetcode_Math;

public class Solution598 {

}
class Solution598Method{
	public int maxCount(int m, int n, int[][] ops) {
        if(ops.length == 0 )return m * n;
        int minRow = Integer.MAX_VALUE;
        int minColumn = Integer.MAX_VALUE;
        for(int i = 0; i < ops.length; i++){
            minRow = Math.min(ops[i][0], minRow);
            minColumn = Math.min(ops[i][1], minColumn); 
        }
        return minRow * minColumn;
    }
}
class Solution598Method2{
	
}
