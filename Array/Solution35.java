package leetcode_Array;

public class Solution35 {

}
class Solution35Method1{
	public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while(low + 1 < high){
            int mid = (high - low) / 2 + low;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target) low = mid;
            else high = mid;
        }
        if(target <= nums[low]) return low;
        else if(target <= nums[high]) return high;
        else return high + 1;
    }
}
