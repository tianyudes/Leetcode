package Leetcode_Tree;

public class Solution104 {

	public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        if(root.right == null && root.left == null) return 1;
        return 1 + Math.max(maxDepth(root.right), maxDepth(root.left));
    }
}
