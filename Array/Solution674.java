package leetcode_Array;

public class Solution674 {

}
class Solution674Method1{
	public int findLengthOfLCIS(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int count = 1;
        int maxLength = Integer.MIN_VALUE;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i-1]){
                count++;
            }else{
                maxLength = Math.max(maxLength, count);
                count = 1;
            }
        }
        return Math.max(maxLength, count);
    }
}
