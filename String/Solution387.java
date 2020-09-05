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
	//������i + 'a' ����ط�һ��Ҫת����char�����������ת��������¾�ֱ��
	//ǿ������ת�����ڶ������ �����ȫ������һ������ĸ�����ʱ��res�������
	//��Ҫ��������ķ���ֵ��
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