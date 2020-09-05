package Leetcode_Tree;

public class Solution101 {

	public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return equals(root.left, root.right);
    }
    public boolean equals(TreeNode p, TreeNode q){
        if(p == null && q == null) return true;
        if(p == null && q != null || p != null && q == null || p.val != q.val ) return false;
        return equals(p.left,q.right) && equals(q.left, p.right);
    }
}
