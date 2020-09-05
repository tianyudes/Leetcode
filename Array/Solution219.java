package leetcode_Array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution219 {

}
class Solution219Method1Wrong{
	public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        boolean res = false;
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                return res || i - map.get(nums[i]) <= k;// 这个地方是不对的不能提前返回，因为还有后面呢，可能后面的就满足条件了，之前也
                //翻过这样的错误，所以要改成res = 。。。才对，其次就是如果出现两个被压进去的情况要怎么办呢....
                //这样就会被覆盖，put(1,3)和put(1,2)就会被覆盖。
            }else{
                map.put(nums[i],i);
            }
        }
        return res;
    }
	//这个的问题在于if-else的逻辑上，这个if-else是不存在的，就是不管是否存在都要加进来，存在的话就进行值的覆盖，不存在就加进来，花流程图可以明显的
	//发现这个错误。
}
class Solution219Method1{
	public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        boolean res = false;
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                res = res || i - map.get(nums[i]) <= k;
            }
            map.put(nums[i],i);   
        }
        return res;
    }
}

class Solution219Method2{
	//这个不是很懂，好好想一下。
	public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(i > k) set.remove(nums[i-k-1]);
            if(!set.add(nums[i])) return true;
        }
        return false;
 }
}