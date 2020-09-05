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
	//这个就是简单的调换，好处是空间复杂度为O(1)，这里指调用了一个temp的内存
	//没什么坏处，比较简单普通
}
class Solution344Method2{
	 public char[] reverseString(char[] s) {
	        return new StringBuilder(s.toString()).reverse().toString().toCharArray();
	    }
	 //这个方法是不符合要求的，原因在于建立了一个新的StringBuilder是不对的。
	 //但是这个很好的地方在于，清楚的说明了StringBuilder怎么用。
	 
}
