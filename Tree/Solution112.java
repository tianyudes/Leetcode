package Leetcode_Tree;

public class Solution112 {

	public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;
        if(root.val == sum && root.right == null && root.left == null) return true;
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}
//������Ҫ�����һ���������ڵ���� [1,2] ����1�Ļ��᷵��false��
