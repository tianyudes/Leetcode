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
	//这个想法是对的但是输出总是会多一个就有点没弄明白,搞清楚了，这里的-2，-2（第一个是节点值，第二个是8 -10得到的），所以要记住，只有从根节点出发的才可以把跟
	public int pathSum2(TreeNode root, int sum) {
        if(root == null) return 0;
        
        return fromRoot(root, sum)+ pathSum(root.left,sum) + pathSum(root.right,sum);
        
    }
    public int fromRoot(TreeNode root, int sum){
        if(root == null) return 0;
        int res = 0;
        if(root.val == sum)res++;
        res += fromRoot(root.left,sum - root.val) + fromRoot(root.right,sum - root.val); 
        return res;//这个是连续搜索的。
    } 
}
