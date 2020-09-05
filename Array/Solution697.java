package leetcode_Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution697 {

	public static void main(String[] args) {
		int[] nums = {1,3,4,2,3,5,6,7,54,7,8,5,4};
		int res = findShortestSubArray(nums);
		System.out.println(res);
	}
	public static int findShortestSubArray(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }else{
                map.put(nums[i],1);
            }
        }
        int max = 0;
        for(Integer i : map.values()){
            max = Integer.max(i,max);
        }
        int minLength = nums.length;
        for(Integer i : map.keySet()){
            if(map.get(i) == max){
                minLength = Integer.min(minLength, startToEnd(i, nums));
            }
        }
        return minLength;
        
        
    }
    public static int startToEnd(int num, int[] nums){
        int start = 0;
        int end = nums.length - 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == num){
                start = i;
                break;
            }
        }
        for(int i = nums.length - 1; i>=0; i--){
            if(nums[i] == num){
                end = i;
                break;
            }
        }
        System.out.println(num + ":" + (end - start));
        return end - start + 1;
    }
}
