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
	//��Ҫע��ĵط� 1.�ǵݹ� 2.�ں����β������Ҫ��סҪ�����1�ӻ�����
}
