package leetcode_Array;

import java.util.Arrays;
import java.util.HashSet;

public class Solution268 {

	/**
	  * �����һ��������������sort���к��ҳ���
	 * hashset
	  * ��λ�� 1^1 = 0;�������ȱ2�Ļ���ȫ����λ��һ�顣
	  *  ��д��
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
	 * ��λ��
	 */
	public int missingNumber(int[] nums) {
        int missing = nums.length; //����һ���ǳ��ȣ�Ҫ��Ȼ�������־ͱ�������
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
        //������������Ǻ��ʺϡ�
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

