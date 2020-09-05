package leetcode_Array;

public class Solution189 {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5};
		int k = 2; 
		rotate(nums, k);
		
	}
	public static void rotate(int[] nums, int k) {
        int[] a = new int[nums.length];
        int shift = k; 
        int temp = 0;
          for(int i = 0; i < k % nums.length; i++){
        	  shift = k;
              while((shift + i) % nums.length != i) {
            	  temp = nums[(shift + k + i) % nums.length];
            	  nums[(shift + k + i) % nums.length] = nums[(shift + i) % nums.length];
            	  nums[(shift + i) % nums.length] = temp;
            	  shift += k;
              }
              for(int j = 0; j < nums.length; j++) {
            	  System.out.print(nums[j] + " ");
              }
              System.out.println();
          }
  }
}
class Solution189Method2{
	public static void rotate(int[] nums, int k) {
        int[] a = new int[nums.length];
        int shift = k; 
        int temp = 0;
          for(int i = 0; i < nums.length; i++){
              while(shift % nums.length != i) {
            	  temp = nums[(shift + k) % nums.length];
            	  nums[(shift + k) % nums.length] = nums[shift];
            	  nums[shift] = temp;
            	  shift += k;
              }
              for(int j = 0; j < nums.length; j++) {
            	  System.out.print(nums[j] + " ");
            	  System.out.println("temp = " + temp);
              }
          }
  }
}
class Solution189Wrong{
	public void rotate(int[] nums, int k) {
        int length = nums.length;
        for(int i = 0; i < (length - k - 1) / 2; i++){
            int temp = nums[length - k - 1 - i];
            nums[length - k - i - 1] = nums[i];
            nums[i] = temp; 
        }
        for(int i = length - k; i < length - (k + 1) / 2; i++){
            int temp = nums[length - 1 - i];
            nums[length - 1 - i] = nums[i];
            nums[i] = temp;
        }
        for(int i = 0; i < length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
/*
class Solution189Method1{
	public void rotate(int[] nums, int k) {
        int[] a = new int[nums.length];
          for(int i = 0; i < nums.length; i++){
              a[(i + k) % nums.length] = nums[i];
          }
          for(int i = 0; i < nums.length; i++){
              nums[i] = a[i];
          }  
  }
}
*/
class Solution189Method3{
	public void rotate(int[] nums, int k) {
        if((k = k % nums.length) != 0){
            int length = nums.length;
        for(int i = 0; i <= (length - k - 1) / 2; i++){
            int temp = nums[length - k - 1 - i];
            nums[length - k - i - 1] = nums[i];
            nums[i] = temp; 
        }
        for(int i = 0; i < k / 2; i++){
            
            int temp = nums[length - k + i];
            nums[length - k + i] = nums[length - 1 - i];
            nums[length - 1 - i] = temp;
        }
        for(int i = 0; i < length / 2; i++){
            int temp = nums[i];
            nums[i] = nums[length - i - 1];
            nums[length - 1 - i] = temp;
        }
     }
}
}
