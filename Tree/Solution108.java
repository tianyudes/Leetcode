package Leetcode_Tree;

public class Solution108 {

	public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0) return null;
        return getRoot(nums, 0, nums.length - 1);
    }
    public TreeNode getRoot(int[] nums, int low, int high){
        if(low > high) return null;
        int mid = (high - low) / 2 + low;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = getRoot(nums, low, mid - 1);
        root.right = getRoot(nums,mid + 1, high);
        return root;
    }
}
