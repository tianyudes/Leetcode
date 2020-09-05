package Leetcode_Tree;

public class Solution437 {

}
class Solution437Method1{
	public int pathSum(TreeNode root, int sum) {
        if(root == null) return 0;
        int res = 0;
        if(root.val == sum){
            res ++;
        }else{
            res += pathSum(root.left,sum - root.val) + pathSum(root.right,sum - root.val) + pathSum(root.left,sum) + pathSum(root.right,sum);
        }
        return res;
    }
	//����뷨�ǶԵĵ���������ǻ��һ�����е�ûŪ����,������ˣ������-2��-2����һ���ǽڵ�ֵ���ڶ�����8 -10�õ��ģ�������Ҫ��ס��ֻ�дӸ��ڵ�����Ĳſ��԰Ѹ�
	public int pathSum2(TreeNode root, int sum) {
        if(root == null) return 0;
        
        return fromRoot(root, sum)+ pathSum(root.left,sum) + pathSum(root.right,sum);
        
    }
    public int fromRoot(TreeNode root, int sum){
        if(root == null) return 0;
        int res = 0;
        if(root.val == sum)res++;
        res += fromRoot(root.left,sum - root.val) + fromRoot(root.right,sum - root.val); 
        return res;//��������������ġ�
    } 
}
