package leetcode_String;

public class Solution13 {

}
class Solution13Method1{
	public int romanToInt(String s) {
        int res = toNum(s.charAt(0));
         for(int i = 1; i < s.length(); i++){
             res += toNum(s.charAt(i));
             if(toNum(s.charAt(i)) > toNum(s.charAt(i - 1))){
                 res = res - 2 * toNum(s.charAt(i - 1));
             }
        }
                return res;
    }
    public int toNum(char c){
        int res = 0;
        switch (c){
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
        }
        return res; 
    }
}