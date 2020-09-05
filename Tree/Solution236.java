package Leetcode_Tree;

public class Solution236 {

	public static void main(String[] args) {
		TreeNode a = new TreeNode(3); 
		TreeNode a1 = new TreeNode(5); 
		TreeNode a2 = new TreeNode(1); 
		TreeNode a3 = new TreeNode(6); 
		TreeNode a4 = new TreeNode(2); 
		TreeNode a5 = new TreeNode(0); 
		TreeNode a6 = new TreeNode(8); 
		TreeNode a7 = new TreeNode(7); 
		TreeNode a8 = new TreeNode(4); 
		a.left=a1;
		a.right=a2;
		a1.left=a3;
		a1.right=a4;
		a4.left = a7;
		a4.right=a8;
		a2.left=a5;
		a2.right=a6;
	}
}
class Solution_236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
    }
    
    public void getNodePath(TreeNode curr, TreeNode target) {
    	
    }
}