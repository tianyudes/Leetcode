package Leetcode_Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution113 {

	public static void main(String[] args) {
		TreeNode a = new TreeNode(5); 
		TreeNode a1 = new TreeNode(4); 
		TreeNode a2 = new TreeNode(8); 
		TreeNode a3 = new TreeNode(11); 
		TreeNode a4 = new TreeNode(13); 
		TreeNode a5 = new TreeNode(4); 
		TreeNode a6 = new TreeNode(7); 
		TreeNode a7 = new TreeNode(2); 
		TreeNode a8 = new TreeNode(5); 
		TreeNode a9 = new TreeNode(1);
		a.left=a1;
		a.right=a2;
		a1.left=a3;
		a3.left = a6;
		a3.right=a7;
		a2.left=a4;
		a2.right=a5;
		a5.left=a8;
		a5.right=a9;
		
		Solution_113 solution = new Solution_113();
		List<List<Integer>> res = solution.pathSum(a,22);
		for (List<Integer> i : res) {
			System.out.println(i.toString());
		}
	}
}
class Solution_113{
	public List<List<Integer>> pathSum(TreeNode root, int sum){
		if(root == null) return null;
		Stack<Integer> path = new Stack<Integer>();
		List<List<Integer>> res =new  ArrayList<List<Integer>>();
		getThePath(root, sum, path, res);
		return res;
	}
	public void getThePath(TreeNode root, int sum, Stack<Integer> path, List<List<Integer>> res) {
		if(root == null) return;
        path.push(root.val);
        
        if(root.val == sum && root.right == null && root.left == null) {
        	res.add(new ArrayList<Integer>(path)); //要注意，这里要重新建一个数组。
        }else {
        	getThePath(root.left, sum - root.val, path, res);
            getThePath(root.right, sum - root.val, path, res);
        }
        
        
        path.pop();
    }
}
