package com;

import java.util.ArrayList;
import java.util.List;

public class Minimum_Absolute_Difference_in_BST {
	
	public class TreeNode 
	{
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
	}
	
	public static void main(String[] args) 
	{
		Minimum_Absolute_Difference_in_BST mad = new Minimum_Absolute_Difference_in_BST();
		TreeNode a = mad.new TreeNode(1);
		TreeNode b = mad.new TreeNode(2);
		TreeNode c = mad.new TreeNode(3);
		a.left=b;
		a.right=c;
		System.out.println(mad.getMinimumDifference(a));
		
	}
	
	public int getMinimumDifference(TreeNode root) 
	{
        List<Integer> l=new ArrayList<>();
        preHelper(root,l);
        for(Integer h:l)
        	System.out.println(h);
        System.out.println();
        if(l.size()==2) 
        	return l.get(1)-l.get(0);
        else
        {
            int min=l.get(1)-l.get(0);
            int cand=l.get(1);
            for(int i=2;i<l.size();i++)
            {
                if(l.get(i)-cand<min) 
                	min=l.get(i)-cand;
                
                cand=l.get(i);
            }
            return Math.abs(min);
        }
    }
	
    public void preHelper(TreeNode root,List<Integer> l)
    {
        if(root.left!=null) 
        	preHelper(root.left,l);
        
        l.add(root.val);
        
        if(root.right!=null) 
        	preHelper(root.right,l);
    }

}
