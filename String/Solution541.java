package leetcode_String;

public class Solution541 {

	public static void main(String[] args) {
		int i = 0;
		int j = 2;
		while (i++ < j--) {
			System.out.println("---------"+ i + "--------" + j);
		}
	}
}
class Solution541Method{
	public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        for(int start = 0; start < chars.length; start += 2 * k){
            int i = start, j = Math.min(i + k - 1, chars.length - 1);
            while(i < j){ // ���ָ�����λ��Ҫ������Ū��������.��Ϊ������i++�˺���ͱ��ˡ�
                char temp = chars[i];
                chars[i++] = chars[j];
                chars[j--] = temp;
            }
        }
        return new String(chars);
    }
}
class Test541{
	
}