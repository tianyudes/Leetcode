package leetcode_Array;

public class Solution88 {

	public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // 这道题简直就是坑啊，m和n究竟什么意思，反正这个地方就是m - 1;
        int j = n - 1;
        int count = m + n - 1;
        while(i >= 0 && j >= 0){
            nums1[count--] = nums1[i] >= nums2[j] ? nums1[i--] : nums2[j--];
        }
        while(j >= 0){
            nums1[count--] = nums2[j--];
        }
    }
}
