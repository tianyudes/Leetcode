package leetcode_String;

public class Solution451 {

}
class Solution451Method1{
	public String addStrings(String num1, String num2) {
        int count = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        StringBuilder sb = new StringBuilder();
        while(i >= 0 || j >= 0){
            if(i >= 0) count += (int) (num1.charAt(i) - '0'); i--;
            if(j >= 0) count += (int) (num2.charAt(j) - '0'); j--;
            sb.append(count % 10);
            count = count / 10;
        }
        if(count != 0) sb.append(count);
        return sb.reverse().toString();
    }
}
class Solution451Method2{
	public String addStrings(String num1, String num2) {
        int count = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        StringBuilder sb = new StringBuilder();
        while(i >= 0 && j >= 0){
            count += (int) (num1.charAt(i) - '0' + num2.charAt(j) - '0'); 
            i--;
            j--;
            sb.append(count % 10);
            count = count / 10;
        }
        while(i >= 0){
            count += (int) (num1.charAt(i) - '0');
            i--;
            sb.append(count % 10);
            count = count / 10;
        }
        while(j >= 0){
            count += (int) (num2.charAt(j) - '0');
            j--;
            sb.append(count % 10);
            count = count / 10;
        }
        if(count != 0) sb.append(count);
        return sb.reverse().toString();
    }
}