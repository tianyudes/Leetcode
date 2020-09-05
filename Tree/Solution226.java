package Leetcode_Tree;

public class Solution226 {

}
class TreeNode226{
	
		      int val;
		      TreeNode226 left;
		      TreeNode226 right;
		      TreeNode226(int x) { val = x; }
}

class Solution226Method1{
	public TreeNode226 invertTree(TreeNode226 root) {
        if(root == null || root.right == null && root.left == null) return root;
        TreeNode226 temp;
        temp = root.right;
        root.right = root.left;
        root.left = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
