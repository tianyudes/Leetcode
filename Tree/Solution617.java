package Leetcode_Tree;

public class Solution617 {

}
class TreeNode617 {
	   int val;
	   TreeNode617 left;
	   TreeNode617 right;
	   TreeNode617(int x) { val = x; }
}
class Solution617Method1{
	public TreeNode617 mergeTrees(TreeNode617 t1, TreeNode617 t2) {
        if(t2 == null) return t1;
        if(t1 == null) return t2;
        t1.val += t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }
}
