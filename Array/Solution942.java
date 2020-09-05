package leetcode_Array;

public class Solution942 {

	public int[] diStringMatchWrong(String S) {
        int[] res = new int[S.length() + 1];
        int temp = S.length();
        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i) == 'I'){
                res[i+1] = temp--;
            }
        }
        int inc = 1; 
        for(int i = 0; i < S.length()&&inc <= temp; i++){
            if(S.charAt(i) == 'D'){
                res[i+1] = inc++;
            }
        }
        return res;
    }
	public int[] diStringMatch(String S) {
        int[] res = new int[S.length() + 1];
        int dec = S.length();
        int inc = 0;
         
        for(int i = 0; i < S.length()&&dec >= inc; i++){
            if(S.charAt(i) == 'D'){
                res[i] = dec--;
            }
            if(S.charAt(i) == 'I'){
                res[i] = inc++;
            }
        }
        res[res.length - 1] = inc;
        return res;
    }
	//想法是对的，就是分开放进去。但是最后对应方式要思考一下。
}
