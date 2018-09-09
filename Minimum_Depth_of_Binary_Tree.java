package com;

import java.util.LinkedList;

public class Minimum_Depth_of_Binary_Tree {
	
	public class TreeNode 
	  {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	
	
	public int minDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		if (root.left == null && root.right == null) {
			return 1;
		}
		int minDepth = 1;
		LinkedList<TreeNode> list = new LinkedList<>();
		list.add(root);
		while (!list.isEmpty()) {
			LinkedList<TreeNode> nextLayer = new LinkedList<>();
			while (!list.isEmpty()) {
				TreeNode removed = list.remove();
				if (removed.left == null && removed.right == null) {
					return minDepth;
				}
				if (removed.left != null) {
					nextLayer.add(removed.left);
				}
				if (removed.right != null) {
					nextLayer.add(removed.right);
				}
			}
			minDepth++;
			list.addAll(nextLayer);
		}
		return minDepth;
	}

}
