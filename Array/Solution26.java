package leetcode_Array;

public class Solution26 {

}
class Solution26Method1{
	public int removeDuplicates(int[] nums) {
        if(nums == null) return 0;
        int count = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i - 1]){
                nums[count++] = nums[i];
            }
        }
        return count;
    }
}
//��������൱��˫ָ��ķ�����������һ��count ����һ��i��������һ����Ԫ��ʱ�ͻ��������ָ���Ԫ�ز�һ���������
