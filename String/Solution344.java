package leetcode_String;

public class Solution344 {

}
class Solution344Method1{
	public void reverseString(char[] s) {
        int right = s.length - 1;
        int left = 0;
        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
	//������Ǽ򵥵ĵ������ô��ǿռ临�Ӷ�ΪO(1)������ָ������һ��temp���ڴ�
	//ûʲô�������Ƚϼ���ͨ
}
class Solution344Method2{
	 public char[] reverseString(char[] s) {
	        return new StringBuilder(s.toString()).reverse().toString().toCharArray();
	    }
	 //��������ǲ�����Ҫ��ģ�ԭ�����ڽ�����һ���µ�StringBuilder�ǲ��Եġ�
	 //��������ܺõĵط����ڣ������˵����StringBuilder��ô�á�
	 
}
