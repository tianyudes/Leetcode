package leetcode_Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Solution448 {

}
class Solution448Method1{//��ϣ��
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
class Solution448Method2{ //����
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
	//������������⣺������ÿһ������һ������������Ԫ�أ������еĳ��������Σ��е�û�г��֣�����������Ҫ���ľ��ǲ��ð����ǹ�λ��ֻ�Ǹ�����һλ�ϵ����ִ��ھ���
	//���ԾͶ��������- 1��Ȼ��ȥ������Ӧλ���ϵģ�ԭӦ����������λ���ϵ����֣���������ֱ�ɸ�����ͬʱ��סҪ�жϣ�ֻ�е���������ִ���0��ʱ��Ż��ɸ�����
	//�������д��ڵ����ֵĶ�Ӧλ���ϵ����ֶ�����˸�����������ɸѡ����0�����Ϳ��ԷŽ�ȥ�ˡ�
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