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
    }//这个就是一定要注意，这个要排除出现0 的可能101不是。所以每次都要判断是不是0，在 while循环的条件上也是不能用 i%10，因为706这样的会直接跳出循环，不能正确判断
}
