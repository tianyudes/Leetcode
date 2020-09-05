package Leetcode_Tree;

public class Solution111 {

	public int minDepth(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null || root.right == null){
            return Math.max(minDepth(root.right), minDepth(root.left)) + 1;
        }
        return Math.min(minDepth(root.right),minDepth(root.left)) + 1;
    }
}
