package leetcode_Array;

public class Solution661 {

	public int[][] imageSmoother(int[][] M) {
        if(M == null) return null;
        int[][] res = new int[M.length][M[0].length];
        for(int i = 0; i < M.length; i++)
            for(int j = 0; j < M[0].length; j++){
                int count = 0;
                for(int r = i - 1; r <= i + 1; r++)
                    for(int c = j - 1; c <= j + 1; c++){
                        if(r < M.length && r >= 0 && c >= 0 && c < M[0].length ){
                            count++;
                            res[i][j] += M[r][c];
                        }
                    }
                    res[i][j] = (int)res[i][j] / count;
            }
        return res;
    }
}
