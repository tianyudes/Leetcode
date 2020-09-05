package leetcode_Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution217 {
    
    }


class Solution217method1{
	/*
	 * ʱ�临�Ӷ�O(n);
	 * �ռ临�Ӷ�O(n);
	 */
	public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        boolean res = false;
        for(int num : nums){
            res = res || !set.add(num);
        }
        return res;
	}
	//��������õ���HashSet�ķ�����HashSetֻ�ܼ��벻�ظ������ݣ����Կ���ͨ�����������ص�ֵ�õ����Ľ��������Ҫע����ǣ�
	
	//��������ظ��Ļ��ͻ᷵��false������Ҫ���������ġ�
	
}
class Solution217method2{
	/*
	 * ����2�ǽ�ԭ�����������Ȼ�������Ľ���ڽ��м�飬������ֵĺ�һ���Ƿ���ں�ǰһ����ͬ�����
	 * �������������ĺ�һ���
	 * ʱ�临�Ӷ�
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
