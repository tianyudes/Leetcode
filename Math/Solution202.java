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
	//首先方法是其次的，主要是这个题里面出现了for循环中不仅仅是遍历的情况
	//还可以做其他的操作，但是要记住，中间的表达式是允许通过的条件。
	//想法是有两种情况结束循环，第一种是和小于10，同时 平方和为奇数，这种情况下就终止。
}
class Solution202Method2{
	public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        for(int sum = 0; set.add(n); n = sum, sum = 0  ){//每次循环结束一定要sum = 0.
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
//除此之外还有使用map的方法，但是大致和上面的相类似。
