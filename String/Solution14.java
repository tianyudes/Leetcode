package leetcode_String;

public class Solution14 {

}
class Solution14Method1{
	public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";
        String res = strs[0];
        for(int i = 1; i < strs.length; i++){
            while(strs[i].indexOf(res) != 0){
                res = res.substring(0, res.length() - 1);
            }
        }
        return res;
    }
}
class Solution14Method2{
	public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";
        for(int i = 0; i < strs[0].length(); i++){
            char ch = strs[0].charAt(i);
            for(int j = 1; j < strs.length; j++){
                if(i == strs[j].length() || strs[j].charAt(i) != ch){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }
}
