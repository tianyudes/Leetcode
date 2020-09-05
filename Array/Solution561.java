package leetcode_Array;

import java.util.Arrays;

public class Solution561 {

}
class solution561Method1{
	public int arrayPairSum(int[] nums) {
        if(nums == null || nums.length == 0)return 0;
        Arrays.sort(nums);
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            if(i % 2 == 0){
                res += nums[i];
            }
        }
        return res;
    }
}
class Solution561Method1Improve{
	public int arrayPairSum(int[] nums) {
        if(nums == null || nums.length == 0)return 0;
        Arrays.sort(nums);
        //int res = 0;
        for(int i = 2; i < nums.length; i+=2){
                nums[0] += nums[i];
        }
        return nums[0];
    }
}
