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
//Ҳ������hashset������ʱfalse��ȥ����������������������������е�Ҫ�󣬾���Ҫ�ռ临�Ӷ�ΪO��1��.
