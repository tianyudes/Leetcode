package leetcode_Array;

public class Solution717 {

	public static void main(String[] args) {
		char[] cha = {'1','0','1','0'};
		String[] strs = {"0","01","11"};
		String str = "0";
		
	}
	public boolean isOneBitCharacter(int[] bits) {
        int i = bits.length - 2;
        while (i >= 0 && bits[i] > 0) i--;
        return (bits.length - i) % 2 == 0;
    }
	public boolean isOneBitCharacter1(int[] bits) {
        if(bits.length == 1) return true;
        if(bits[bits.length - 2] == 0){
            return true;
        }else{
            if(bits.length == 2 || isLeagal(bits)){
                return false;
            } 
        }
        return true;
    }
    public boolean isLeagal(int[] bits){ 
        if(bits.length == 3){
            if(bits[0] == 1) return false;
            else return true;
        }
        String[] strs = {"01","11","00"};
        StringBuilder sb = new StringBuilder();
        sb.append(bits[bits.length - 3]);
        sb.append(bits[bits.length - 4]);
        for(String s : strs){
            if(s.equals(sb.toString())){
                return true;
            }
        }
        return false;
    }
}
