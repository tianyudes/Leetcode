package leetcode_Array;

public class Solution26 {

}
class Solution26Method1{
	public int removeDuplicates(int[] nums) {
        if(nums == null) return 0;
        int count = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i - 1]){
                nums[count++] = nums[i];
            }
        }
        return count;
    }
}
//这个就是相当于双指针的方法，首先是一个count 还有一个i，当出现一样的元素时就会出现两个指向的元素不一样的情况。
