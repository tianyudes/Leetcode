package leetcode_Array;

public class Solution27 {

}
class Solution27Method{
	public int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[count++] = nums[i];
            }
        }
        return count;
    }
}