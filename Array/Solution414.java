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
        //������ʱ������Ȼ�����ҵ������������������Ǵ��[2231]���Ӧ����1.
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
	 //����һ�������з���û���ų��ظ�����������ź������������ظ���ɾ���������Һܺ���ʣ�µ��������
	 //�೤����������Ͳ���һ���£���������״���䣬ֻ��ı�ǰ��count�����֣��������count�Ķ�����䡣
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
	 //����2�ĺô����ǲ�ռ�ڴ棬��������77%�࣬�ʺ�����˼·��
}
