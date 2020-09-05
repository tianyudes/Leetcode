package leetcode_String;

public class Solution67 {

	public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        while(i >= 0 && j >= 0){
            carry += a.charAt(i) + b.charAt(j) - '0' -'0';
            sb.append(carry % 2);
            carry = carry / 2;
            i--;
            j--;
        }
        while(i >= 0){
            carry += a.charAt(i) - '0';
            sb.append(carry % 2);
            carry = carry / 2;
            i--;
        }
        while(j >= 0){
            carry += b.charAt(j) - '0';
            sb.append(carry % 2);
            carry = carry / 2;
            j--;
        }
        if(carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }
}
