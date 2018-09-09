package com;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Binary_Tree_Level_Order_Traversal_II {
	
	public class TreeNode 
	  {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }

	
	public List<List<Integer>> levelOrderBottom(TreeNode root) 
	{
		LinkedList<List<Integer>> result = new LinkedList<>();
		
	    if (root == null) {
	        return (List<List<Integer>>) result;
	    }
	    
	    Deque<TreeNode> queue = new ArrayDeque<>();
	    queue.offerLast(root);
	    while (!queue.isEmpty()) {
	        int size = queue.size();
	        List<Integer> curr = new ArrayList<>();
	        for (int i = 0; i < size; i++) {
	            TreeNode node = queue.pollFirst();
	            curr.add(node.val);
	            if (node.left != null) {
	                queue.offerLast(node.left);
	            }
	            if (node.right != null) {
	                queue.offerLast(node.right);
	            }
	        }
	        
	        result.addFirst(curr);
	    }
	    
	    return (List<List<Integer>>) result;
        
    }

}
