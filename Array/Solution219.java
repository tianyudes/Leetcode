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
                return res || i - map.get(nums[i]) <= k;// ����ط��ǲ��ԵĲ�����ǰ���أ���Ϊ���к����أ����ܺ���ľ����������ˣ�֮ǰҲ
                //���������Ĵ�������Ҫ�ĳ�res = �������Ŷԣ���ξ����������������ѹ��ȥ�����Ҫ��ô����....
                //�����ͻᱻ���ǣ�put(1,3)��put(1,2)�ͻᱻ���ǡ�
            }else{
                map.put(nums[i],i);
            }
        }
        return res;
    }
	//�������������if-else���߼��ϣ����if-else�ǲ����ڵģ����ǲ����Ƿ���ڶ�Ҫ�ӽ��������ڵĻ��ͽ���ֵ�ĸ��ǣ������ھͼӽ�����������ͼ�������Ե�
	//�����������
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
	//������Ǻܶ����ú���һ�¡�
	public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(i > k) set.remove(nums[i-k-1]);
            if(!set.add(nums[i])) return true;
        }
        return false;
 }
}