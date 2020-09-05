package Leetcode_Math;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution645 {

}
class Solution645Method1{
	public int[] findErrorNums(int[] nums) {
        int[] res = new int[2];
        if(nums == null || nums.length ==0) return null;
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            if(!set.add(nums[i])){
                res[0] = nums[i];
            }else{
                sum += nums[i];
            }
        }
        res[1] = (nums.length+1) * nums.length / 2 - sum;
        return res;
    }
}
class Solution645Method2{
	public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int[] res= new int[2];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                res[0] = nums[i];
            }
            if(nums[i] - nums[i-1] == 2){
                res[1] = nums[i] - 1;
            }
        }
        if(nums[0] != 1) res[1] = 1;
        if(nums[nums.length - 1] != nums.length) res[1] = nums.length;
        return res;
    }
}
class Solution645Method3{
	public int[] findErrorNums(int[] nums) {
        int[] num = new int[nums.length];
        int[] res = new int[2];
        for(Integer i : nums){
            num[i - 1]++;
        }
        for(int i = 0; i < num.length; i++){
            if(num[i] == 2){
                res[0] = i+1; 
            }
            if(num[i] == 0){
                res[1] = i+1;
            }
        }
        return res;
    }
}
//实际上还有最后一种方法，但是我现在能掌握的就已经够了。