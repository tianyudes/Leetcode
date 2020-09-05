package leetcode_Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Solution448 {

}
class Solution448Method1{//哈希表
	public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(Integer i : nums) set.add(i);
        for(int i = 0; i < nums.length; i++){
            if(!set.contains(i+1)){
                list.add(i + 1);
            }
        }
        return list;
    }
}
class Solution448Method2{ //数组
	public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int[] list = new int[nums.length + 1];
        for(int i = 1; i < list.length; i++){
            list[nums[i - 1]] = 1;
        }
        for( int i =1; i < list.length; i++){
            if(list[i] == 0){
                res.add(i);
            }
        }
        return res;
    }
}
class Solution448Method3{
	
	public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i + 1){
                list.add(i+1);
                System.out.println(list.toString());
            }
            if(list.contains(nums[i])){
                list = list.subList(list.indexOf(nums[i])+1, list.size());
                System.out.println(list.toString());
            }
                
        }
        return list;
    }
	//这个方法如何理解：首先是每一个数都一定是这个数组的元素，但是有的出现了两次，有的没有出现，所以我们需要做的就是不用把他们归位，只是告诉这一位上的数字存在就行
	//所以就对这个数字- 1，然后去找他对应位置上的，原应该属于她的位置上的数字，将这个数字变成负数，同时记住要判断，只有当下这个数字大于0的时候才会变成负数，
	//这样所有存在的数字的对应位置上的数字都变成了负数，这样再筛选大于0的数就可以放进去了。
}
class Solution448Method4{
	public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int value = Math.abs(nums[i]) - 1;
            if(nums[value] > 0){
                nums[value] = -nums[value];
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                list.add(i + 1);
            }    
        }
        return list;
    }
}