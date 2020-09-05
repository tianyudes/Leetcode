package leetcode_Array;

public class Solution167 {

}
class Solution167Method1{
	public int[] twoSum(int[] numbers, int target) {
        if(numbers[0] > target || numbers == null || numbers.length == 0) return new int[]{-1, -1};
        int low = 0;
        int high = numbers.length - 1;
        int[] res = new int[]{-1, -1};
        while( low < high){
            if(numbers[low] + numbers[high] == target){
                return new int[]{low + 1, high + 1};
            }else if(numbers[low] + numbers[high] < target){
                low++; 
            }else{
                high--;
            }
        }
        return res;
    }
	public int[] twoSum2(int[] numbers, int target) {
        //if(numbers[0] > target || numbers == null || numbers.length == 0) return new int[]{-1, -1};
        int i = 0;
        int j = numbers.length - 1;
        while(i < j){
            if(numbers[i] + numbers[j] == target){
                return new int[]{i + 1, j + 1};
            }else if(numbers[i] + numbers[j] < target){
                i++; 
            }else{
                j--;
            }
        }
        return null;
    }
}
