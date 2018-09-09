package com;


import java.util.LinkedList;
import java.util.Queue;

public class Symmetric_Tree {
	
	public class TreeNode 
	  {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }

	public static void main(String[] args) {
//		TreeNode tree = new TreeNode( 20 );
//		int[] nums = {15, 200, 25, -5, 0, 100, 20, 12, 126, 1000, -150};
//		for(int i : nums ) {
//		tree.addNode( i );
		
		
		Symmetric_Tree st = new Symmetric_Tree();
		TreeNode a = st.new TreeNode(1);
		a.left=st.new TreeNode(2);
		a.right=st.new TreeNode(2);
		
		System.out.println(st.isSymmetric(a));
		
//		}

	}
	
	
	public boolean isSymmetric(TreeNode root) {
	    return isMirror(root, root);
	}

	public boolean isMirror(TreeNode t1, TreeNode t2) {
	    if (t1 == null && t2 == null) return true;
	    if (t1 == null || t2 == null) return false;
	    return (t1.val == t2.val)
	        && isMirror(t1.right, t2.left)
	        && isMirror(t1.left, t2.right);
	}
    
}
