package Leetcode_Math;

import java.util.Arrays;

public class Solution908 {

}
class Solution908Method1{
	public int smallestRangeI(int[] A, int K) {
        if(A.length <= 1) return 0;
        Arrays.sort(A);
        if(A[A.length - 1] - A[0] < 2 * K) return 0;
        else return A[A.length - 1] - A[0] - 2 * K;
    }
}
class Solution908Method2{
	public int smallestRangeI(int[] A, int K) {
        if(A.length <= 1) return 0;
        int max = A[0];
        int min = A[0];
        for(int i : A){
            max = Math.max(max, i);
            min = Math.min(min, i);
        }
        return Math.max(0, max - min - 2 * K);
    }
}
