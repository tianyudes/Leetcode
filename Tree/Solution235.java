package Leetcode_Tree;

public class Solution235 {

}
class Solution235Method1{
	public TreeNode235 lowestCommonAncestor(TreeNode235 root, TreeNode235 p, TreeNode235 q) {
        int rootVal = root.val;
        int pVal = p.val;
        int qVal = q.val;
        if(pVal < rootVal && qVal < rootVal){
            return lowestCommonAncestor(root.left,p,q);
        }else if (pVal > rootVal && qVal > rootVal){
            return lowestCommonAncestor(root.right, p, q);
        }else{
            return root;
            
        }
    }
}
class TreeNode235 {
	      int val;
	      TreeNode235 left;
	      TreeNode235 right;
	      TreeNode235(int x) { val = x; }
	  }

//�����ûʲô��˵�ģ���Ҫ����Ҫע��BST���ص����left < parent < right;