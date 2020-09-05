package Leetcode_Math;

public class Solution754 {

	public int reachNumber(int target) {
        target = Math.abs(target);
        int sum = 0;
        int k = 0;
        while(sum < target){
            k++;
            sum += k;
        }
        if((sum - target) % 2 == 0){
            return k;
        }
        return k % 2 == 0 ? k+1 : k+2;
    }
}
