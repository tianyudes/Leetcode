package Leetcode_Math;

import java.util.HashSet;
import java.util.Set;

public class Solution202 {

}
class Solution202Method1{
	public boolean isHappy(int n) {
        for(int sum = 0; n / 10 != 0 || n % 2 != 0; n = sum, sum = 0 ){
            for(int i = n; n > 0; n = n / 10){
                sum += Math.pow(n % 10, 2);
            }
            if(sum == 1){
                return true;
            }
        }
        return false;
    }
	//���ȷ�������εģ���Ҫ����������������forѭ���в������Ǳ��������
	//�������������Ĳ���������Ҫ��ס���м�ı��ʽ������ͨ����������
	//�뷨���������������ѭ������һ���Ǻ�С��10��ͬʱ ƽ����Ϊ��������������¾���ֹ��
}
class Solution202Method2{
	public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        for(int sum = 0; set.add(n); n = sum, sum = 0  ){//ÿ��ѭ������һ��Ҫsum = 0.
            for(int i = n; n > 0; n = n / 10){
                sum += Math.pow(n % 10, 2);
            }
            if( sum == 1){
                return true;
            }
        }
        return false;
    }
}
//����֮�⻹��ʹ��map�ķ��������Ǵ��º�����������ơ�
