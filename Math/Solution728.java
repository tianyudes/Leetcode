package Leetcode_Math;

import java.util.ArrayList;
import java.util.List;

public class Solution728 {

}
class Solution728Method1{
	public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int i = left; i < right + 1; i++){
            if(isSelfDividingNumbers(i)){
                list.add(i);
            }
        }
        return list;
    }
    public boolean isSelfDividingNumbers(int num){
        if(num % 10 == 0) return false;
        int i = num;
        while(i > 0){
            if(i % 10 == 0) return false;
            if(num % (i % 10) == 0){
                i = i / 10;
            }else{
                return false; 
            }
        }
        return true;
    }//�������һ��Ҫע�⣬���Ҫ�ų�����0 �Ŀ���101���ǡ�����ÿ�ζ�Ҫ�ж��ǲ���0���� whileѭ����������Ҳ�ǲ����� i%10����Ϊ706�����Ļ�ֱ������ѭ����������ȷ�ж�
}
