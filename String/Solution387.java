package leetcode_String;

public class Solution387 {

}
class Solution387Method1{
	public int firstUniqChar(String s) {
        if(s.length() == 0 || s == null) return -1;
        int[] letterList = new int[26];
        int res = Integer.MAX_VALUE;
        for(Character ch : s.toCharArray()){
            letterList[(int)(ch - 'a')]++;
        }
        for(int i = 0; i < 26; i++){
            if(letterList[i] == 1){
                res = Math.min(res, s.indexOf((char)(i + 'a')));
            }
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }
	//首先是i + 'a' 这个地方一定要转换成char，不清楚类型转换的情况下就直接
	//强制类型转换，第二点就是 会出现全部都是一样的字母，这个时候res还是最大
	//就要返回上面的返回值。
}
class Solution387Method2{
	public int firstUniqChar(String s) {
        int index = s.length();
        for(char c='a'; c<='z';c++)
        {
            int id = s.indexOf(c);
            if(id!=-1 && id == s.lastIndexOf(c))
            {
                index = Math.min(index, id);
            }
        }
        return index==s.length() ? -1:index;
    }
}