package Leetcode_Math;

public class Solution338 {
	public static void main(String[] args) {
		Solution_338 solution = new Solution_338();
		int[] res = solution.countBits(6);
		for (int i:res) {
			System.out.println(i);
		}
	}
}

class Solution_338 {
    public int[] countBits(int num) {
        if(num < 0) {
        	return null;
        }
        int[] res = new int[num + 1];
        res[0] = 0; // 0 -> 0
        for(int i = 1; i <= num; i++) {
        	if(i % 2 == 0) {
        		res[i] = res[i / 2];
        	}else {
        		res[i] = res[i-1] + 1;
        	}
        }
        return res;
    }
}
