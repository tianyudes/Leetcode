package leetcode_Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution217 {
    
    }


class Solution217method1{
	/*
	 * 时间复杂度O(n);
	 * 空间复杂度O(n);
	 */
	public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        boolean res = false;
        for(int num : nums){
            res = res || !set.add(num);
        }
        return res;
	}
	//上面这个用的是HashSet的方法，HashSet只能加入不重复的数据，所以可以通过检查这个返回的值得到最后的结果，但是要注意的是，
	
	//如果发现重复的话就会返回false，所以要看反过来的。
	
}
class Solution217method2{
	/*
	 * 方法2是将原数组进行排序，然后将排序后的结果在进行检查，检查数字的后一项是否存在和前一项相同的情况
	 * 这个方法比上面的好一点点
	 * 时间复杂度
	 */
	
	    public boolean containsDuplicate(int[] nums) {
	        Arrays.sort(nums);
	        for(int i = 0; i < nums.length - 1; i++){
	            if(nums[i] == nums[i+1]){
	                return true;
	            }
	        }
	        return false;
	    }
	
	
}
