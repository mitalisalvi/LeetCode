package com;



public class Balanced_Binary_Tree {
	
	public class TreeNode 
	  {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	
	public boolean isBalanced(TreeNode root) {
        // base case
        if (root == null) return true;
        
        int leftHeight = getHeight(root.left, 1);
        int rightHeight = getHeight(root.right, 1);
        
        // check if subtree contains invalid format
        if (leftHeight == -1 || rightHeight == -1) return false;
        // check if overall structure is valid
        return Math.abs(leftHeight-rightHeight) <= 1;
 }
    
 public int getHeight(TreeNode root, int height) {
        if (root == null) return height;
        
        int leftHeight = getHeight(root.left, height+1);
        int rightHeight = getHeight(root.right, height+1);
        
        // (2) at least one the subtree violated the balance condition
        if (leftHeight == -1 || rightHeight == -1) return -1;
        // (1) the difference between current left subtree height and current right subtree height is more than 1
        if (Math.abs(leftHeight-rightHeight) > 1) return -1;
        // return height
        return Math.max(leftHeight, rightHeight);
}

}
