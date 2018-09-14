package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Find_Mode_in_Binary_Search_Tree 
{
	
	 // Definition for a binary tree node.
	  public  class TreeNode 
	  {
	      int  val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) 
	      { 
	    	  val = x; 
	      }
	  }
	  
	   //int max=Integer.MIN_VALUE;
	   HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
	

	public static void main(String[] args) 
	{
		Find_Mode_in_Binary_Search_Tree st = new Find_Mode_in_Binary_Search_Tree();
		TreeNode a = st.new TreeNode(1);
		
		//a.left=st.new TreeNode(3);
		a.right=st.new TreeNode(2);
		
//		a.left.left=st.new TreeNode(2);
//		a.left.right =st.new TreeNode(4);
//		
//		a.left.right.left =st.new TreeNode(4);
//		a.left.right.right =st.new TreeNode(4);
//		
//		a.right.left=st.new TreeNode(6);
//		a.right.right=st.new TreeNode(7);
//		
//		a.right.left.left=st.new TreeNode(6);

	

		int [] res = st.findMode(a);
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}
  
  
	}
	
	public  int[] findMode(TreeNode root) 
	{
		
		int[] res= null;
		
		if(root==null)
		{
			return new int[0];
		}
		inorder(root);
		
		List<Integer> values= new ArrayList<Integer>();
		//System.out.println(hm);

		for(Integer temp:hm.keySet())
		{
			values.add(hm.get(temp));
		}
		Collections.sort(values);
		
		int maxFromValues = Collections.max(values,null);
		//System.out.println("maxFromValues:"+maxFromValues);
		
		List<Integer> maxValuesToBeAdded= new ArrayList<Integer>();
		for(Integer tempKey:hm.keySet())
		{
			int tempValue= hm.get(tempKey);
			if(maxFromValues==tempValue)
			{
				maxValuesToBeAdded.add(tempKey);
			}
		}
		//System.out.println(maxValuesToBeAdded);

		res= new int[maxValuesToBeAdded.size()];
		for(int i=0;i<maxValuesToBeAdded.size();i++)
		{
			res[i]=maxValuesToBeAdded.get(i);
		}
		return res;
        
    }
	
	public  void inorder(TreeNode root)
	{
		if (root.left!=null)
		{
			inorder(root.left);
		}
		
			if (!hm.containsKey(root.val))
				hm.put(root.val, 1);
			else
				hm.put(root.val, (hm.get(root.val))+1);
		
		//max = Math.max(max, hm.get(root.val));
		if (root.right!=null)
		{
			inorder(root.right);
		}
	}

}
