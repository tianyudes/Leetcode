package leetcode_String;

public class Solution383 {

}
class Solution383Method1{
	public boolean canConstruct(String ransomNote, String magazine) {
        int[] res = new int[26];
        for(Character ch : magazine.toCharArray()){
            res[(int) ch - 'a']++;
        }
        for(Character ch : ransomNote.toCharArray()){
            res[(int) ch - 'a']--;
        }
        for(int i : res){
            if(i < 0){
                return false;
            }
        }
        return true;
    }
}
class Solution383Method2{
	public boolean canConstruct(String ransomNote, String magazine) {
        int[] res = new int[26];
        for(Character ch : magazine.toCharArray()){
            res[(int) ch - 'a']++;
        }
        for(Character ch : ransomNote.toCharArray()){
            if(--res[(int) ch - 'a'] < 0){
                return false;
            }
        }
        return true;
    }
}
