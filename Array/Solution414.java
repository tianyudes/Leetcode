package leetcode_Array;

import java.util.Arrays;

public class Solution414 {

}
class Solution414Method1Wrong{
	public int thirdMax(int[] nums) {
        int i = nums.length;
        Arrays.sort(nums);
        if(nums.length < 3){
            return nums[nums.length - 1]; 
        }else{
            return nums[i - 3];
        }
        //这个像的时先排序，然后再找到倒数第三个，但是是错的[2231]结果应该是1.
    }
	
}
class Solution414Method1{
	 public int thirdMax(int[] nums) {
	        Arrays.sort(nums);
	        int count = 1;
	        for(int i = 1; i < nums.length; i++){
	            if(nums[i] != nums[i-1]){
	                nums[count++] = nums[i];
	            }
	        }
	        if(count < 3){
	            return nums[count - 1]; 
	        }else{
	            return nums[count - 3];
	        }
	    }
	 //再上一个方法中发现没有排除重复项，这个里面对排好序的数组进行重复项删除，但是我很好奇剩下的数组会变成
	 //多长，所以下面就测试一下下，结论是形状不变，只会改变前面count个数字，后面大于count的都不会变。
}

class Solution414Method2{
	 public int thirdMax(int[] nums) {
		 Integer max1 = null;
		 Integer max2 = null;
		 Integer max3 = null;
		 for (Integer n : nums) {
			 if (n.equals(max1) || n.equals(max2) || n.equals(max3)) continue;
			 if (max1 == null || n > max1) {
				 max3 = max2;
				 max2 = max1;
				 max1 = n;
			 } else if (max2 == null || n > max2) {
				 max3 = max2;
				 max2 = n;
			 } else if (max3 == null || n > max3) {
				 max3 = n;
			 }
		 }
		 return max3 == null ? max1 : max3;
	 }
	 //方法2的好处就是不占内存，两个都是77%多，适合整理思路。
}
