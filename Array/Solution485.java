package leetcode_Array;

public class Solution485 {

}
class Solution485Method1{
	public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = -1;
        for(int i : nums){
            if(i == 1){
                count++;
            }else{
                count = 0;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}
