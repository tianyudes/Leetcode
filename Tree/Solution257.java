package Leetcode_Tree;

import java.util.LinkedList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class Solution257 {

}
class TreeNode257{
	int val;
	TreeNode257 left;
    TreeNode257 right;
    TreeNode257(int x) { val = x; }
}

class Solution257Method1{
	public List<String> binaryTreePaths(TreeNode257 root) {
        List<String> res = new LinkedList<>();
        if(root == null) return res;
        String path = Integer.toString(root.val);
        if(root.left == null && root.right == null){
            res.add(path);
            return res;
        }
        getPath(root.left, path, res);
        getPath(root.right, path, res);
        return res;
        
    }
    private void getPath(TreeNode257 root, String path, List<String> res){
        if(root != null) {
            path = path + "->" + root.val;
            if(root.right == null && root.left == null){ 
                res.add(path);
                return;
            }
            getPath(root.left, path, res);
            getPath(root.right, path, res);
        }
    }
}
