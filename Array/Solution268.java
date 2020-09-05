package leetcode_Array;

import java.util.Arrays;
import java.util.HashSet;

public class Solution268 {

	/**
	  * 这道题一共有四种做法，sort排列后找出来
	 * hashset
	  * 按位与 1^1 = 0;所以如果缺2的话就全部按位与一遍。
	  *  我写的
	 */
}
class Solution268Method1{
	public int missingNumber(int[] nums) {
        if (nums == null) return 0;
        int sum1 = nums.length * (nums.length + 1) / 2;
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        return sum1 - sum;
    }
}
class Solution268Method2{
	/*
	 * 按位与
	 */
	public int missingNumber(int[] nums) {
        int missing = nums.length; //这里一定是长度，要不然最大的数字就被孤立了
        for(int i = 0; i < nums.length; i++){
            missing ^= nums[i] ^ i;
        }
        return missing;
    }
}

class Solution268Method3{
	public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums[0] != 0) return 0;
        if(nums[nums.length - 1] != nums.length) return nums.length;
        
        for(int i = 1; i < nums.length; i++){
            if(nums[i] - nums[i-1] != 1){
                return nums[i] - 1;
            }
        }
        return -1;
        //这个很慢，不是很适合。
    }
}
class Solution268Method4{
	public int missingNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(Integer i : nums) set.add(i);
        for(int i = 0; i <= nums.length; i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return -1;
    }
}

