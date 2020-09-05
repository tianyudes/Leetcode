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
	//������ҿ����ˣ�Ӧ������ڶ�С�ġ�����������ǵڶ����
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
	//һ�ٲ������绢�������û�����ߣ�1��1��3�ͽ����ˡ�
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