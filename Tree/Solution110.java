package Leetcode_Tree;

public class Solution110 {

	public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        if(Math.abs(maxDepth(root.left) - maxDepth(root.right)) > 1){
            return false;
        } 
        return isBalanced(root.right) && isBalanced(root.left);
    }
    public int maxDepth(TreeNode p){
        if(p == null) return 0;
        return 1 + Math.max(maxDepth(p.right), maxDepth(p.left));
        
    }
}
