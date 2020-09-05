package Leetcode_Tree;

public class Solution671 {

}
class Solution671Method0{
	public int findSecondMinimumValue0(TreeNode root) {
        int res = -1;
        if(root.right == null && root.left == null) return -1;
        res = Math.max(root.left.val, root.right.val) == root.val ? -1 : Math.min(root.left.val, root.right.val);
        return Math.max(Math.max(res, findSecondMinimumValue0(root.left)), findSecondMinimumValue0(root.right));
    }
	//这个是我看错了，应该是求第二小的。但是我求得是第二大的
}
class Solution671MethodWrong{
	public int findSecondMinimumValue(TreeNode root) {
        int res = -1;
        if(root.right == null && root.left == null) return -1;
        int min = Math.min(root.right.val, root.left.val);
        int max = Math.max(root.right.val, root.left.val);
        if(root.right.val != root.left.val){
            res = min == root.val ? max : min;
        }else{
            if(root.right.val != root.val){
                res = root.right.val;
            }else{
                res = Math.min(findSecondMinimumValue(root.right),findSecondMinimumValue(root.left)) == -1 ?
                    Math.max(findSecondMinimumValue(root.right),findSecondMinimumValue(root.left)) :
                    Math.min(findSecondMinimumValue(root.right),findSecondMinimumValue(root.left));
                //return Math.max(findSecondMinimumValue(root.right),findSecondMinimumValue(root.left));
            }
        }
        return res;
    }
	//一顿操作猛如虎结果根本没往下走，1，1，3就结束了。
}
class Solution671Correct{
	public int findSecondMinimumValue(TreeNode root) {
        if(root == null || root.left == null && root.right == null)
        	return -1;
        
        int left = root.left.val;
        int right = root.right.val;
 
        if(root.left.val == root.val)
        	left = findSecondMinimumValue(root.left);
        if(root.right.val == root.val)
        	right = findSecondMinimumValue(root.right);
        if (left != -1 && right != -1) 
            return Math.min(left, right);
        else if (left != -1)
            return left;
        else
            return right;
    }	
}