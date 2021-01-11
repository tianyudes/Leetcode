package Leetcode_HashTable;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {

}
class Solution1Method1{
	public int[] twoSum(int[] nums, int target) {
        if(nums == null || nums.length == 0) return new int[]{-1,-1};
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[]{-1, -1};
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                res[0] = map.get(target - nums[i]);
                res[1] = i;
                return res;
                //这个地方可以改程直接输出。
            }
            map.put(nums[i], i);
        }
        return res;
    }
}

// https://leetcode.com/problems/two-sum/