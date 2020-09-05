package leetcode_Array;

import java.util.ArrayList;
import java.util.List;

public class Solution119 {

	public List<Integer> getRow(int rowIndex) {
        List<Integer> old = new ArrayList<>();
        old.add(1);
        if(rowIndex == 0) return old;
        //for循环，第一个一定要从1开始，第二个循环不通过，只有1，1.
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
//还是用两个数组交换。
