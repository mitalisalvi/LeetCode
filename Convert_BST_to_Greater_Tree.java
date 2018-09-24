package com;

import java.util.ArrayList;
import java.util.List;

public class Convert_BST_to_Greater_Tree {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		Convert_BST_to_Greater_Tree mad = new Convert_BST_to_Greater_Tree();
		TreeNode a = mad.new TreeNode(1);
		TreeNode b = mad.new TreeNode(2);
		TreeNode c = mad.new TreeNode(3);
		a.left = b;
		a.right = c;
		TreeNode result = convertBST(a);

	}

	/* Get the node with the smallest value greater than this one. */
	private static TreeNode getSuccessor(TreeNode node) {
		TreeNode succ = node.right;
		while (succ.left != null && succ.left != node) {
			succ = succ.left;
		}
		return succ;
	}

	public static TreeNode convertBST(TreeNode root) {
		int sum = 0;
		TreeNode node = root;

		while (node != null) {
			/*
			 * If there is no right subtree, then we can visit this node and
			 * continue traversing left.
			 */
			if (node.right == null) {
				sum += node.val;
				node.val = sum;
				node = node.left;
			}
			/*
			 * If there is a right subtree, then there is at least one node that
			 * has a greater value than the current one. therefore, we must
			 * traverse that subtree first.
			 */
			else {
				TreeNode succ = getSuccessor(node);
				/*
				 * If the left subtree is null, then we have never been here
				 * before.
				 */
				if (succ.left == null) {
					succ.left = node;
					node = node.right;
				}
				/*
				 * If there is a left subtree, it is a link that we created on a
				 * previous pass, so we should unlink it and visit this node.
				 */
				else {
					succ.left = null;
					sum += node.val;
					node.val = sum;
					node = node.left;
				}
			}
		}

		return root;
	}

}
