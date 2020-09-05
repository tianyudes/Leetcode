package Leetcode_LinkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution102 {

}
class Solution102Method1{
	public List<List<Integer>> levelOrder(TreeNode102 root) {
	    List<List<Integer>> res = new LinkedList<>();
	    if(root == null) return res;
	    Queue<TreeNode102> queue = new LinkedList<>();
	    queue.offer(root);
	    while(!queue.isEmpty()){
	        int size = queue.size();
	        List<Integer> list = new LinkedList<>();
	        for(int i = 0; i < size; i++){
	            TreeNode102 curr = queue.poll();
	            if(curr.right != null || curr.left != null){
	                if(curr.left!= null) queue.offer(curr.left);
	                if(curr.right != null) queue.offer(curr.right);
	            }
	            list.add(curr.val);
	        }
	        res.add(list);
	    }
	    return res;
	}
}
class TreeNode102{
		int val;
		TreeNode102 left;
	    TreeNode102 right;
	    TreeNode102(int x) { val = x; }
}

