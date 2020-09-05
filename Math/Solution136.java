package Leetcode_Math;

public class Solution136 {

	public int singleNumber(int[] nums) {
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            res ^= nums[i];
        }
        return res;
    }
}
//也可以用hashset，返回时false就去掉这个数，但是这个不符合最后题中的要求，就是要空间复杂度为O（1）.
