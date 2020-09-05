package leetcode_Array;

public class Solution665 {

}
class Solution665Method1Wrong{
	public boolean checkPossibility(int[] nums) {
        if(nums == null) return false;
        if(nums.length <= 2) return true;
        int count = 0;
        boolean res = true;
        for(int i = 0; i < nums.length - 2; i++){
            int max = Math.max(nums[i], nums[i+1]);
            int min = Math.min(nums[i], nums[i+1]);
            if(min > nums[i + 2]){
                 if(nums[i + 1] < nums[i]){
                     return false;
                 }else{
                     count++;
                     nums[i] = nums[i + 2];
                     nums[i + 1] = nums[i + 2]; 
                 }
            }else if(min == nums[i + 2]){
                if(max == nums[i + 2]) continue;
                else{
                    count++;
                    nums[i] = nums[i+2];
                    nums[i+1] = nums[i+2];
                }
            }else{
                if(max > nums[i+2]){
                    nums[i] = min;
                    nums[i + 1] = nums[i];
                    count++;
                }
                else{
                    continue;
                }
            }
        }
        return count <= 1;
    }
}
