package leetcode_Array;

import java.util.ArrayList;
import java.util.List;

public class Solution119 {

	public List<Integer> getRow(int rowIndex) {
        List<Integer> old = new ArrayList<>();
        old.add(1);
        if(rowIndex == 0) return old;
        //forѭ������һ��һ��Ҫ��1��ʼ���ڶ���ѭ����ͨ����ֻ��1��1.
        for(int i = 1; i <= rowIndex; i++){
            List<Integer> now = new ArrayList<>();
            now.add(1);
            for(int j = 1; j < i; j++){
                now.add(old.get(j-1) + old.get(j));
            }
            now.add(1);
            old = now;
        }
        return old;
    }
}
//�������������齻����
