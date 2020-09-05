package leetcode_Array;

import java.util.ArrayList;
import java.util.List;

public class Solution118 {

	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if(numRows == 0) return res;
        List<Integer> old = new ArrayList<>();
        old.add(1);
        res.add(old);
        for(int i = 2; i <= numRows; i++){
            List<Integer> now = new ArrayList<>();
            now.add(1);
            for(int j = 1; j < old.size(); j++){
                 now.add(old.get(j - 1) + old.get(j));
            }
            now.add(1);
            res.add(now);
            old = now;
        }
        return res;
    }
}
//就是要建立两个list，新的和旧的，这样才能继续。
