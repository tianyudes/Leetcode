package Leetcode_Tree;

public class Solution112 {

	public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;
        if(root.val == sum && root.right == null && root.left == null) return true;
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}
//这个题的要求就是一定得世道节点才行 [1,2] 查找1的话会返回false。
