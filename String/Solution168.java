package leetcode_String;

public class Solution168 {

	public String convertToTitle(int n) {
        if(n < 0) return null;
        StringBuilder sb = new StringBuilder();
        n = n - 1; 
        if(n < 26) sb.append((char)(n + 'A'));
        if(n >= 26) sb.append(convertToTitle(n / 26)).append(convertToTitle(n % 26 + 1));
        return sb.toString();
    }
	//需要注意的地方 1.是递归 2.在后面的尾巴那里要记住要把这个1加回来。
}
